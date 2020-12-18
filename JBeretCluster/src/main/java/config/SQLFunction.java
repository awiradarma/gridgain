package config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteAtomicSequence;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.query.annotations.QuerySqlFunction;

/**
 * SQLFunction
 */
public class SQLFunction {


    static Map<String, IgniteAtomicSequence>  sequences = new ConcurrentHashMap<String, IgniteAtomicSequence>();

    @QuerySqlFunction
    public static long nextSequence(String table) {
        if (sequences.containsKey(table)) {
            return sequences.get(table).incrementAndGet();
        } else {
            return -1;
        }
    }

    @QuerySqlFunction
    public static int pangkat(int x) {
        return x * x;
    }

    public static void createSequence(Ignite ignite, String table, long start) {
        if (!sequences.containsKey(table)) {
            //Ignite ignite = Ignition.ignite();
            //System.out.println("Initializating a new sequence " + table );
            IgniteAtomicSequence seq = ignite.atomicSequence(table, start, true);
            sequences.put(table,seq);

            //for (String key : sequences.keySet()) {
            //    System.out.println(key);
            //}
        }
    }
        
}