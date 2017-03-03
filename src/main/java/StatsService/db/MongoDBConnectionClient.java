package StatsService.db;

import StatsService.model.Pkm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ramin on 12/5/2016.
 */
@Service
public class MongoDBConnectionClient implements IDatabaseConnectionClient {

    @Autowired
    private PkmRepository pkmRepository;

    @Override
    public Pkm getPkm(int id) {
        return pkmRepository.findByDexNumber(id);
    }

    @Override
    public List<Pkm> getAllPkm() {
        return pkmRepository.findAll();
    }

    @Override
    public void savePkm(Pkm pkm) {
        pkmRepository.save(pkm);
    }

    @Override
    public Pkm updatePkm(Pkm pkm) {
        //FIXME not done yet
        return pkm;
    }

    @Override
    public void deletePkm(int id) {
        pkmRepository.delete(id);
    }
}
