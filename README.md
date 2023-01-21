# TeacherExercise
4.2.2

Imos crear a clase abstracta Teacher.

Terá os atributos name, surname, address de tipo String e baseSalary de tipo double. Ademais terá o atributo salary que é o que cobra cada profesor mensualmente.

Terá o método void teach() que saca por pantalla a mensaxe "Dou unha clase de programación en Java" e o método void generatePayroll() (xerar nómina), que será abstracto.

Implementaremos as seguintes clases fillas da anterior:

    CareerOfficer (funcionario de carreira): que terá os atributos officerComplement de tipo double, oppositionYear (ano de oposición) de tipo int, e oppositionPlace (lugar de oposición) de tipo String. O calculo da nómina será a suma do baseSalary e o officerComplement. Este dato almacenarase en salary.
    Interim (interino): que terá os atributos interimComplement de tipo double e destination de tipo String. O cálculo da nómina será a suma do baseSalary e o interimComplement. Este dato almacenarase en salary.
    Substitute (substituto): que terá os atributos displacement (desprazamento) de tipo double e initDate de tipo java.util.Date. O cálculo da nómina será a suma do baseSalary e o displacement. Este dato almacenarase en salary. Esta clase sobreescribirá o método "teach()" para mostrar a mensaxe "Substitúo unha clase de programación en Java".

Cada atributo debe estar declarado coa visibilidade mínima necesaria para que poida ser accedido dende as clases que o utilizan.

Na clase Teacher incluirase o método principal no que:

    Se creará un obxecto de cada subclase.
    Estableceranse os valores para todos os seus atributos.
    Xerarase a nómina de cada obxecto profesor.
    Mostrarase unha mensaxe para cada obxecto profesor da seguinte forma: "Chámome name e o meu salario é de salary", mostrando en "name" e "salary" o valor destes atributos.
    Invocarase o método "teach()" de cada obxecto profesor.
