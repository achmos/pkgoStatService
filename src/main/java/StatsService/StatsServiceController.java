package StatsService;

import StatsService.db.IDatabaseConnectionClient;
import StatsService.model.BuddySize;
import StatsService.model.Pkm;
import StatsService.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ramin on 11/28/2016.
 */

@RestController
@RequestMapping(value="/api")
public class StatsServiceController {
    @Autowired
    IDatabaseConnectionClient dbConnectionClient;

    @RequestMapping(method=RequestMethod.POST, value="/pokemon/")
    public ResponseEntity<Pkm> addPkm(@Valid @RequestBody Pkm newPkm) {
        System.out.println(newPkm.toString());
        dbConnectionClient.savePkm(newPkm);
        Pkm pkm = dbConnectionClient.getPkm(newPkm.getDexNumber());
        return new ResponseEntity(pkm,HttpStatus.CREATED);
    }

    @RequestMapping(method=RequestMethod.GET, value="/pokemon/")
    public List<Pkm> getPkmList() {
        return dbConnectionClient.getAllPkm();
    }

    @RequestMapping(method=RequestMethod.GET, value="/pokemon/{pkmId}")
    public ResponseEntity<Pkm> getPkm(@PathVariable int pkmId)  {
        ResponseEntity<Pkm> responseEntity;
        Pkm pkm = dbConnectionClient.getPkm(pkmId);

        if (pkm == null) {
            throw new IllegalArgumentException(String.format("%l does not exist", pkmId));
        } else {
            responseEntity = new ResponseEntity<Pkm>(pkm,HttpStatus.OK);
        }

        return responseEntity;
    }
//    FIXME create the update function on DBConnectionClient
//    @RequestMapping(method=RequestMethod.PUT, value="/pokemon/{id}")
//    public Pkm updatePkm(){
//
//    }
//
    @RequestMapping(method=RequestMethod.DELETE, value="/pokemon/{pkmId}")
    public ResponseEntity<Pkm> removePkm(@PathVariable int pkmId) {
        Pkm pkm = dbConnectionClient.getPkm(pkmId);
        ResponseEntity<Pkm> responseEntity;

        if (pkm == null)
            throw new IllegalArgumentException(String.format("%l does not exist", pkmId));
        else {
            dbConnectionClient.deletePkm(pkmId);
            responseEntity = new ResponseEntity<Pkm>(pkm,HttpStatus.OK);
        }

        return responseEntity;
    }

    @RequestMapping(method=RequestMethod.GET, value="/pokemon/{pkmId}/moves")
    public Map<String,List<String>> getMovesOfPkmById(@PathVariable int pkmId){
        Pkm pkm = dbConnectionClient.getPkm(pkmId);
        if (pkm == null)
            throw new IllegalArgumentException(String.format("%l does not exist", pkmId));

        HashMap<String,List<String>> moves = new HashMap<String,List<String>>();
        moves.put("quickMoves",pkm.getQuickMoves());
        moves.put("chargeMoves",pkm.getChargeMoves());
        return moves;
    }

    @RequestMapping(method=RequestMethod.GET, value="/pokemon/{pkmId}/stats")
    public Map<String,Integer> getStatsOfPkmById(@PathVariable int pkmId){
        Pkm pkm = dbConnectionClient.getPkm(pkmId);
        if (pkm == null)
            throw new IllegalArgumentException(String.format("%l does not exist", pkmId));

        return pkm.getStats();
    }
//
//-------------------------------- finalize these apis -------------------------------------
//
//    @RequestMapping(method=RequestMethod.GET, value="/moves")
//    public Move getQuickMovesList() {
//
//    }
//
//    @RequestMapping(method=RequestMethod.GET, value="/moves/{id}")
//    public Move getQuickMovesList() {
//
//    }
//
//    @RequestMapping(method=RequestMethod.GET, value="/moves/{type}")
//    public Move getChargeMovesList() {
//
//    }
//
//    @RequestMapping(method=RequestMethod.GET, value="/moves/quickMoves")
//    public Move getQuickMovesList() {
//
//    }
//
//    @RequestMapping(method=RequestMethod.POST, value="/moves/quickMoves")
//    public Move getQuickMovesList() {
//
//    }
//
//    @RequestMapping(method=RequestMethod.GET, value="/moves/quickMoves/{type}")
//    public Move getQuickMovesList() {
//
//    }
//
//    @RequestMapping(method=RequestMethod.GET, value="/moves/chargeMoves")
//    public Move getChargeMovesList() {
//
//    }
//
//    @RequestMapping(method=RequestMethod.POST, value="/moves/chargeMoves")
//    public Move getChargeMovesList() {
//
//    }
//
//    @RequestMapping(method=RequestMethod.GET, value="/moves/chargeMoves/{type}")
//    public Move getQuickMovesList() {
//
//    }
//
    @RequestMapping(method=RequestMethod.GET, value="/types")
    public Type[] getTypeList() {
        return Type.values();
    }

    @RequestMapping(method=RequestMethod.GET, value="/buddySizes")
    public BuddySize[] getBuddySizeList() {
        return BuddySize.values();
    }
}
