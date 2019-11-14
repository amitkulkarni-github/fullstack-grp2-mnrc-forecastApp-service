package com.mnrc.sales.forecasting.mnrcsalesforecasting.model.repo;

import com.mnrc.sales.forecasting.mnrcsalesforecasting.model.Channel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Channel repository.
 */
@Repository
public interface ChannelRepository extends MongoRepository<Channel, String> {
}
