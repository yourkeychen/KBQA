package com.qdcz.sdn.repository.instruments;

import com.qdcz.sdn.entity.instruments.Show;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hadoop on 17-6-29.
 */
@Repository
public interface ShowRepos extends GraphRepository<Show> {
}
