package utils;
import java.util.Arrays;
import java.util.List;

public class CalculadoraDeSecuencia {
    
    public String posicion = "";

    public CalculadoraDeSecuencia(){

    }
    

    public String calcularSecuencia(String frase){
        
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

        return calcularSecuenciaSegunFrase(splitFrase, caracteres);
    
    }

    private String calcularSecuenciaSegunFrase(String[] splitFrase, String[] caracteres) {
        
        for(int indiceDeFrase = 0; indiceDeFrase<splitFrase.length; indiceDeFrase++){
            
            buscaCoincidenciaTeclaYLetra(caracteres,splitFrase,indiceDeFrase);
            
        }

        return posicion;
    }

    private void buscaCoincidenciaTeclaYLetra(String[] caracteres, String[] splitFrase, int indiceDeFrase){
        for( int indiceDeCaracteres=0; indiceDeCaracteres<caracteres.length; indiceDeCaracteres++ ){
            String teclas[] = caracteres[indiceDeCaracteres].split(","); //me guarda cada letra en un vector
                
            
            for( int indiceDeTeclas=0; indiceDeTeclas<teclas.length; indiceDeTeclas++ ){
                
                boolean existeCoincidencia = teclas[indiceDeTeclas].equals(splitFrase[indiceDeFrase]);//BUSCA COINCIDENCIA DE TECLA CON FRASE

                if( existeCoincidencia ){ 
                    validar(indiceDeTeclas, indiceDeCaracteres, splitFrase, indiceDeFrase,teclas);
                }
            }
        }
        
    }


    private void validar(int indiceDeTeclas, int indiceDeCaracteres, String[] splitFrase, int indiceDeFrase, String[]teclas) {
        
        List <String> listTeclas = Arrays.asList(teclas);
        boolean esUnEspacio = splitFrase[indiceDeFrase].equals(" ");
        boolean NoEsLaUltimaPosicion = (indiceDeFrase+1)<splitFrase.length;
        
        if(esUnEspacio){
            posicion = posicion + indiceDeCaracteres;
        }
        else if (NoEsLaUltimaPosicion){
            concatenarPulsaciones(indiceDeTeclas,indiceDeCaracteres);
            boolean teclaContieneProximaLetraDeFrase = listTeclas.contains(splitFrase[indiceDeFrase + 1]);
            
            if (teclaContieneProximaLetraDeFrase){
                posicion = posicion + " ";
            }
        }
        else{
            concatenarPulsaciones(indiceDeTeclas, indiceDeCaracteres);
        }
        
        
    }


    private void concatenarPulsaciones(int indiceDeTeclas, int indiceDeCaracteres) {
        for(int p=0; p<=indiceDeTeclas; p++){
            posicion = posicion + (indiceDeCaracteres + 1);
        }
    }
}
