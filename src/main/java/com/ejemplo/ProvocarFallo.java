public class ProvocarFallo {
    public void miMetodo() {
        // Variables declaradas que no se usan y nombres no descriptivos (Code Smell)
        int a; 
        int b;

        // Código duplicado o un bug evidente forzado:
        if (true) {
            // Esto siempre se cumple, Sonar lo detectará como código muerto/inútil
        }
        
        // Un bug crítico: asignación de variables sin inicializar o hardcodeadas
        a = 10 / 0; // Provoca una división por cero en ejecución si llega a pasar el test
    }
}
