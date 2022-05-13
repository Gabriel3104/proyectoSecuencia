package utils;
import java.util.Arrays;
import java.util.List;

public class CalculadoraDeSecuencia {
    
    public static String calcularSecuencia(String frase){
        
        String caracteres [] = new String [9];

        caracteres[0] = " ";
        caracteres[1] = "A,B,C";
        caracteres[2] = "D,E,F";
        caracteres[3] = "G,H,I";
        caracteres[4] = "J,K,L";
        caracteres[5] = "M,N,O";
        caracteres[6] = "P,Q,R,S";
        caracteres[7] = "T,U,V";
        caracteres[8] = "W,X,Y,Z";


        String splitFrase[] = frase.split("");
        String posicion="";
    
        for(int indiceDeFrase = 0; indiceDeFrase<splitFrase.length; indiceDeFrase++){
            
            for( int indiceDeCaracteres=0; indiceDeCaracteres<caracteres.length; indiceDeCaracteres++ ){
            
                String teclas[] = caracteres[indiceDeCaracteres].split(","); //me guarda cada letra en un vector
                
                List <String> listTeclas = Arrays.asList(teclas);


                for( int indiceDeTeclas=0; indiceDeTeclas<teclas.length; indiceDeTeclas++ ){
                    
                    if( teclas[indiceDeTeclas].equals(splitFrase[indiceDeFrase]) ){ //BUSCA COINCIDENCIA DE TECLA CON FRASE
                        

                        if(splitFrase[indiceDeFrase].equals(" ")){
                            posicion = posicion + indiceDeCaracteres;
                        }
                        else if ((indiceDeFrase+1)<splitFrase.length){
                            
                            for(int p=0; p<=indiceDeTeclas; p++){
                               posicion = posicion + (indiceDeCaracteres + 1);
                            }
                            

                            if (listTeclas.contains(splitFrase[indiceDeFrase + 1])){
                                posicion = posicion + " ";
                            }
                        }

                        else{

                            for(int p=0; p<=indiceDeTeclas; p++){
                                posicion = posicion + (indiceDeCaracteres + 1);
                            }
                        }
                        
                    }

                }
                
            }
        }

        return posicion;
    }
}
