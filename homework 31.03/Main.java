package ivge;

import javax.management.openmbean.KeyAlreadyExistsException;

public class Main {

    public static void main(String[] args) {
        MyCustomToken something = new MyCustomToken();
        FreeSoftArt freeSoftArt1 = new FreeSoftArt("art one");
        FreeSoftArt freeSoftArt2 = new FreeSoftArt("art two");
        FreeSoftArt freeSoftArt3 = new FreeSoftArt("art two");

        System.out.println(something.getClass());
        System.out.println(freeSoftArt1.getClass());

        NftToken nftToken1 = NftToken.of(freeSoftArt1);
        NftToken nftToken2 = NftToken.of(freeSoftArt2);
        try {
            NftToken nftToken3 = NftToken.of(freeSoftArt3);
        }
        catch (KeyAlreadyExistsException exception)
        {
            exception.printStackTrace(System.out);
            System.out.println( "We should do something");
        }

    }
}