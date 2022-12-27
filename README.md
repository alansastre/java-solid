# Principios SOLID en Java

Principios orientados a objetos con el fin de que el código sea más mantenibles. Tienen su 
origen gracias a Robert Martins (Uncle Bob).

SOLID es un acrónimo mnemotécnico acuñado por Michael Feathers y que se basa en los cinco principios que establece para escribir software comprensible y mantenible:

* **Principio de responsabilidad única (SRP)**: Cada interfaz, clase o método que definamos debe tener un objetivo claramente definido. En esencia, lo ideal es que haga una cosa y la haga bien. Esto lleva a que los métodos y las clases sean más pequeños y que se puedan probar.
* **Principio de apertura-cierre (OCP)**: El código que escribimos debería estar idealmente abierto a la extensión pero cerrado a la modificación. Lo que esto significa es que una clase debe ser escrita de manera que no haya necesidad de modificarla. Sin embargo, debería permitir cambios a través de la herencia o la composición.
* **Principio de sustitución de Liskov (LSP)**: Este principio establece que cada subclase o clase derivada debe ser sustituible por su clase madre o base. Esto ayuda a reducir el acoplamiento en el código base y, por tanto, a mejorar la reutilización.
* **Principio de segregación de interfaces (ISP)**: Implementar una interfaz es una forma de proporcionar un comportamiento específico a nuestra clase. Sin embargo, una clase no debe implementar métodos que no necesita. Esto nos obliga a definir interfaces más pequeñas y centradas.
* **Principio de inversión de la dependencia (DIP)**: Según este principio, las clases sólo deben depender de las abstracciones y no de sus implementaciones concretas. Esto significa efectivamente que una clase no debería ser responsable de crear instancias para sus dependencias. En su lugar, dichas dependencias deben ser inyectadas en la clase.