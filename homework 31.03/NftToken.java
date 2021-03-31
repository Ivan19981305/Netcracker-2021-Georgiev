package ivge;


import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.*;

public class NftToken implements Token{

    private FreeSoftArt freeSoftArt;
    private UUID uniqueId; // UUID.random


    private NftToken(FreeSoftArt freeSoftArt) {
        this.freeSoftArt = freeSoftArt;
        this.uniqueId = UUID.randomUUID();
    }


    public static NftToken of(FreeSoftArt freeSoftArt) throws KeyAlreadyExistsException{
        return NftArtRegistry.registerArt(freeSoftArt);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NftToken nftToken = (NftToken) o;
        return freeSoftArt.equals(nftToken.freeSoftArt) &&
                uniqueId.equals(nftToken.uniqueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeSoftArt, uniqueId);
    }

    @Override
    public String toString() {
        return "NftToken{" +
                "freeSoftArt=" + freeSoftArt +
                ", uniqueId=" + uniqueId +
                '}';
    }


    private static class NftArtRegistry {

        private static final Map<FreeSoftArt, NftToken> REGISTERED_ART = new HashMap<>();

        private static NftToken registerArt(FreeSoftArt freeSoftArt) throws KeyAlreadyExistsException {
            if (REGISTERED_ART.containsKey(freeSoftArt))
            {
                throw new KeyAlreadyExistsException(freeSoftArt.toString() + " already exist");
            }
            else {
                NftToken nftTokenTemp = new NftToken(freeSoftArt);
                REGISTERED_ART.put(freeSoftArt, nftTokenTemp);
                return nftTokenTemp;
            }
        }

    }
}