package test;

import static org.junit.Assert.assertEquals;

import static utils.CalculadoraDeSecuencia.calcularSecuencia;

import org.junit.Test;

public class AppTest {
    
    @Test
    public void cuando_recibe_tecla_espacio_debe_retornar_0(){
        
        String resultado = calcularSecuencia(" ");

        assertEquals("0", resultado);
    }
    
    
    @Test
    public void cuando_recibe_tecla_a_debe_retornar_2(){

        String resultado = calcularSecuencia("A");

        assertEquals("2", resultado);
    }

    @Test
    public void cuando_recibe_tecla_d_debe_retornar_3(){

        String resultado = calcularSecuencia("D");

        assertEquals("3", resultado);
    }

    @Test
    public void cuando_recibe_tecla_g_debe_retornar_4(){

        String resultado = calcularSecuencia("G");

        assertEquals("4", resultado);
    }

    @Test
    public void cuando_recibe_tecla_j_debe_retornar_5(){

        String resultado = calcularSecuencia("J");

        assertEquals("5", resultado);
    }

    @Test
    public void cuando_recibe_tecla_m_debe_retornar_6(){

        String resultado = calcularSecuencia("M");

        assertEquals("6", resultado);
    }

    @Test
    public void cuando_recibe_tecla_p_debe_retornar_7(){

        String resultado = calcularSecuencia("P");

        assertEquals("7", resultado);
    }

    @Test
    public void cuando_recibe_tecla_t_debe_retornar_8(){

        String resultado = calcularSecuencia("T");

        assertEquals("8", resultado);
    }

    @Test
    public void cuando_recibe_tecla_w_debe_retornar_9(){

        String resultado = calcularSecuencia("W");

        assertEquals("9", resultado);
    }

    @Test
    public void cuando_recibe_aa_debe_retornar_2_2(){

        String resultado = calcularSecuencia("AA");

        assertEquals("2 2", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_HI_debe_retornar_44_444(){

        String resultado = calcularSecuencia("HI");

        assertEquals("44 444", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_YES_debe_retornar_999337777(){

        String resultado = calcularSecuencia("YES");

        assertEquals("999337777", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_FOO_BAR_debe_retornar_333666_666022_2777(){

        String resultado = calcularSecuencia("FOO BAR");

        assertEquals("333666 666022 2777", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_HELLO_WORLD_debe_retornar_4433555_555666096667775553(){

        String resultado = calcularSecuencia("HELLO WORLD");

        assertEquals("4433555 555666096667775553", resultado);
    }
    
}



