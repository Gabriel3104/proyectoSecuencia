package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    

    @Test
    public void cuando_recibe_tecla_a_debe_retornar_2(){

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

        String frase = "A";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(2, posicion);
    }

    @Test
    public void cuando_recibe_tecla_d_debe_retornar_3(){

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

        String frase = "D";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(3, posicion);
    }

    @Test
    public void cuando_recibe_tecla_g_debe_retornar_4(){

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

        String frase = "G";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(4, posicion);
    }

    @Test
    public void cuando_recibe_tecla_j_debe_retornar_5(){

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

        String frase = "J";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(5, posicion);
    }

    @Test
    public void cuando_recibe_tecla_m_debe_retornar_6(){

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

        String frase = "M";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(6, posicion);
    }

    @Test
    public void cuando_recibe_tecla_p_debe_retornar_7(){

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

        String frase = "P";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(7, posicion);
    }

    @Test
    public void cuando_recibe_tecla_t_debe_retornar_8(){

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

        String frase = "T";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(8, posicion);
    }

    @Test
    public void cuando_recibe_tecla_w_debe_retornar_9(){

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

        String frase = "W";
        //String splitFrase[] = frase.split("");
        int posicion=0;
    

        for( int i=0; i<caracteres.length; i++ ){
            
            String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
            
            System.out.println(); //para hacer espacio

            for( int x=0; x<teclas.length; x++ ){
                
                if( teclas[x].equals(frase) ){
                    System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                    posicion = i+1;
                }

                System.out.println(teclas[x]);
            }

        }

        assertEquals(9, posicion);
    }

    @Test
    public void cuando_recibe_tecla_aa_debe_retornar_22(){

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

        String frase = "AA";
        String splitFrase[] = frase.split("");
        String posicion="";
    
        for(int y = 0; y<splitFrase.length; y++){
            
            for( int i=0; i<caracteres.length; i++ ){
            
                String teclas[] = caracteres[i].split(","); //me guarda cada letra en un vector
                
                System.out.println(); //para hacer espacio

                for( int x=0; x<teclas.length; x++ ){
                    
                    if( teclas[x].equals(splitFrase[y]) ){
                        System.out.println("La tecla " + teclas[x] + " se encuentra en la tecla " + (i+1));
                        
                        for (int p=0; p<=x; p++){
                            
                            if(splitFrase[y].equals(" ")){
                                posicion = posicion + i;

                            }else{
                                posicion = posicion + (i+1);
                            }
                        }  
                    }

                    System.out.println(teclas[x]);
                }

            }
        }
            

        assertEquals("22", posicion);
    }


}



