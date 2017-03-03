package StatsService.db;

import StatsService.model.Pkm;

import java.util.List;

/**
 * Created by Ramin on 11/28/2016.
 */
public interface IDatabaseConnectionClient {
    public Pkm getPkm(int id);
    public List<Pkm> getAllPkm();
    public void savePkm(Pkm pkm);
    public Pkm updatePkm(Pkm pkm);
    public void deletePkm(int id);
}
