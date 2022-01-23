package cn.lger.dao;

import cn.lger.domain.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-12-17.
 */
@Repository
public interface CommodityDao extends JpaRepository<Commodity, String> {

    @Query("select c from Commodity c where CONCAT(c.id,c.commodityName) LIKE %?1%")
    Commodity findCommodityById(String id);

}
