package coursbd.uqtr.ca;

import View.menuPrincipal;

public class Main {

    public static void main(String[] args) {
	connectionBD.connect();
        menuPrincipal menuPrincipal  =new menuPrincipal();
        menuPrincipal.show();;

    }

}
