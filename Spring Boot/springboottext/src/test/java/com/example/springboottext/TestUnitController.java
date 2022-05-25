package com.example.springboottext;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.springboottext.Controller.TestController;

public class TestUnitController {

    public void testUnit() {
        TestController controller = new TestController();
        String resultado = controller.saudacao("DIO");
        assertEquals("Bem-vindo, DIO", resultado);
    }
}
