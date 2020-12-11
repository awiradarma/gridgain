package load;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;

/** This file was generated by Ignite Web Console (12/08/2020, 21:25) **/
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
    public static void main(String[] args) throws Exception {
        try (Ignite ignite = Ignition.start("ImportedCluster-client.xml")) {
            System.out.println(">>> Loading caches...");

            System.out.println(">>> Loading cache: OwnersCache");
            ignite.cache("OwnersCache").loadCache(null);

            System.out.println(">>> Loading cache: PetsCache");
            ignite.cache("PetsCache").loadCache(null);

            System.out.println(">>> Loading cache: SpecialtiesCache");
            ignite.cache("SpecialtiesCache").loadCache(null);

            System.out.println(">>> Loading cache: TypesCache");
            ignite.cache("TypesCache").loadCache(null);

            System.out.println(">>> Loading cache: VetSpecialtiesCache");
            ignite.cache("VetSpecialtiesCache").loadCache(null);

            System.out.println(">>> Loading cache: VetsCache");
            ignite.cache("VetsCache").loadCache(null);

            System.out.println(">>> Loading cache: VisitsCache");
            ignite.cache("VisitsCache").loadCache(null);

            System.out.println(">>> All caches loaded!");
        }
    }
}