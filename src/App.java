public class App {
    public static void main(String[] args){

    String caracteres [] = new String [9];

    String frase = "Hola como estas";

    String splitFrase [] = frase.split("");


    for(int x=0;x<splitFrase.length;x++){

        System.out.println(splitFrase[x]);
    }

    caracteres[0] = " ";
    caracteres[1] = "A,B,C";
    caracteres[2] = "D,E,F";
    caracteres[3] = "G,H,I";
    caracteres[4] = "J,K,L";
    caracteres[5] = "M,N,O";
    caracteres[6] = "P,Q,R,S";
    caracteres[7] = "T,U,V";
    caracteres[8] = "W,X,Y,Z";

    for(int i=0;i < caracteres.length;i++){
        System.out.println("Estos caracteres estan en la tecla " + caracteres[i]);
        
        String teclas[] = caracteres[i].split(",");
        
        System.out.println();

        for(int x=0;x<teclas.length;x++){
            
            if(teclas[x].equals("T")){
                System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
            }

            System.out.println(teclas[x]);
        }

    }
}

}

