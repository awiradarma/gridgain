package load;

import java.util.ArrayList;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.query.SqlFieldsQuery;

import config.SQLFunction;

/** This file was generated by Ignite Web Console (12/14/2020, 09:58) **/
public class LoadCaches {
    /**
     * <p>
     * Utility to load caches from database.
     * <p>
     * How to use:
     * <ul>
     *     <li>Start cluster.</li>
     *     <li>Start this utility and wait while load complete.</li>
     * </ul>
     * 
     * @param args Command line arguments, none required.
     * @throws Exception If failed.
     **/

    static Ignite ignite;

    public static void main(String[] args) throws Exception {
        try (Ignite ignite = Ignition.start("JberetCluster-client.xml")) {
            System.out.println(">>> Loading caches...");

            System.out.println(">>> Loading cache: JobExecutionCache");
            ignite.cache("JobExecutionCache").loadCache(null);

            System.out.println(">>> Loading cache: JobInstanceCache");
            ignite.cache("JobInstanceCache").loadCache(null);

            System.out.println(">>> Loading cache: PartitionExecutionCache");
            ignite.cache("PartitionExecutionCache").loadCache(null);

            System.out.println(">>> Loading cache: StepExecutionCache");
            ignite.cache("StepExecutionCache").loadCache(null);

            System.out.println(">>> All caches loaded!");
        }
    }
}