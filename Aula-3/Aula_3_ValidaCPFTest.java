package class_0209;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidaCPFTest {

    @Test
    void testCPFValido() {
        ValidaCPF validaCpf = new ValidaCPF();
        assertTrue(validaCpf.isCPF("12345678909"));
    }
    @Test
    void testCPFsInvalidos() {
        ValidaCPF validaCpf = new ValidaCPF();
        assertFalse(validaCpf.isCPF("11111111111")); 
        assertFalse(validaCpf.isCPF("00000000000")); 
    }
    @Test
    void testCPFComTamanhoIncorreto() {
        ValidaCPF validaCpf = new ValidaCPF();
        assertFalse(validaCpf.isCPF("12345")); 
        assertFalse(validaCpf.isCPF("123456789012345")); 
    }
    @Test
    void testCPFComCaracteresNaoNumericos() {
        ValidaCPF validaCpf = new ValidaCPF();
        assertFalse(validaCpf.isCPF("A2345678909"));
    }
    @Test
    void testCPFNulo() {
        ValidaCPF validaCpf = new ValidaCPF();
        assertFalse(validaCpf.isCPF(null)); 
    }
}
