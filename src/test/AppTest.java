package test;

import static org.junit.Assert.assertEquals;

import utils.CalculadoraDeSecuencia;

import org.junit.Test;

public class AppTest {

    CalculadoraDeSecuencia calculadora = new CalculadoraDeSecuencia();
    
    @Test
    public void cuando_recibe_tecla_espacio_debe_retornar_0(){
        
        String resultado = calculadora.calcularSecuencia(" ");

        assertEquals("0", resultado);
    }
    
    
    @Test
    public void cuando_recibe_tecla_a_debe_retornar_2(){

        String resultado = calculadora.calcularSecuencia("A");

        assertEquals("2", resultado);
    }

    @Test
    public void cuando_recibe_tecla_d_debe_retornar_3(){

        String resultado = calculadora.calcularSecuencia("D");

        assertEquals("3", resultado);
    }

    @Test
    public void cuando_recibe_tecla_g_debe_retornar_4(){

        String resultado = calculadora.calcularSecuencia("G");

        assertEquals("4", resultado);
    }

    @Test
    public void cuando_recibe_tecla_j_debe_retornar_5(){

        String resultado = calculadora.calcularSecuencia("J");

        assertEquals("5", resultado);
    }

    @Test
    public void cuando_recibe_tecla_m_debe_retornar_6(){

        String resultado = calculadora.calcularSecuencia("M");

        assertEquals("6", resultado);
    }

    @Test
    public void cuando_recibe_tecla_p_debe_retornar_7(){

        String resultado = calculadora.calcularSecuencia("P");

        assertEquals("7", resultado);
    }

    @Test
    public void cuando_recibe_tecla_t_debe_retornar_8(){

        String resultado = calculadora.calcularSecuencia("T");

        assertEquals("8", resultado);
    }

    @Test
    public void cuando_recibe_tecla_w_debe_retornar_9(){

        String resultado = calculadora.calcularSecuencia("W");

        assertEquals("9", resultado);
    }

    @Test
    public void cuando_recibe_aa_debe_retornar_2_2(){

        String resultado = calculadora.calcularSecuencia("AA");

        assertEquals("2 2", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_HI_debe_retornar_44_444(){

        String resultado = calculadora.calcularSecuencia("HI");

        assertEquals("44 444", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_YES_debe_retornar_999337777(){

        String resultado = calculadora.calcularSecuencia("YES");

        assertEquals("999337777", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_FOO_BAR_debe_retornar_333666_666022_2777(){

        String resultado = calculadora.calcularSecuencia("FOO BAR");

        assertEquals("333666 666022 2777", resultado);
    }

    @Test
    public void cuando_recibe_la_palabra_HELLO_WORLD_debe_retornar_4433555_555666096667775553(){

        String resultado = calculadora.calcularSecuencia("HELLO WORLD");

        assertEquals("4433555 555666096667775553", resultado);
    }
    
}



