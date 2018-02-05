
package com.biantech.spring.samples.whydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>EngineerAny</code>
 *
 * @author jonathan.bian
 * @version 1.0
 * @since 1.0 2016-05-31
 */
public class EngineerAny implements Engineer {
    private static final Logger LOG = LoggerFactory
            .getLogger(EngineerAny.class);

    private TrafficType trafficType;
    private String name;

    public EngineerAny(String name, TrafficType trafficType) {
        this.name = name;
        this.trafficType = trafficType;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void goToWork(){
        LOG.info("这是 {} O(∩_∩)O~",getName());
        LOG.info("{} 去上班", trafficType.trafficType());
    }
}
