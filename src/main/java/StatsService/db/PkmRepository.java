package StatsService.db;

import StatsService.model.Pkm;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ramin on 12/6/2016.
 */
public interface PkmRepository extends MongoRepository<Pkm, Integer> {
    public Pkm findByDexNumber(int dexNumber);
}
