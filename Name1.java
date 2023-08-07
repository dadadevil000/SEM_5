import java.awt.*;

class Name1 extends Frame
{
Name1()
{

setTitle("Student Registration Form");
setSize(800,600);
setLocation(500,200);
setVisible(true);
setLayout(null);

Label l = new Label("Name --");
l.setBounds(30,100,80,30);
add(l);
TextField t = new TextField();
t.setBounds(120,100,200,30);
add(t);

Label l1 = new Label("Address --");
l1.setBounds(30,150,80,30);
add(l1);
TextArea t1 = new TextArea();
t1.setBounds(120,150,200,40);
add(t1);

Label l2 = new Label("Gender --");
l2.setBounds(30,200,80,30);
add(l2);
CheckboxGroup c2 = new CheckboxGroup();
Checkbox c = new Checkbox("Male",c2,true);
c.setBounds(150,200,150,30);
add(c);
Checkbox c1 = new Checkbox("Female",c2,false);
c1.setBounds(300,200,150,30);
add(c1);

Label l3 = new Label("Hobbies --");
l3.setBounds(30,250,80,30);
add(l3);
Checkbox c4 = new Checkbox("Swimming");
c4.setBounds(150,250,150,30);
add(c4);
Checkbox c3 = new Checkbox("Reading");
c3.setBounds(300,250,150,30);
add(c3);
Checkbox c5 = new Checkbox("Drawing");
c5.setBounds(450,250,150,30);
add(c5);
Checkbox c6 = new Checkbox("Driving");
c6.setBounds(600,250,150,30);
add(c6);

Label l4 = new Label("Department --");
l4.setBounds(30,300,120,30);
add(l4);
Choice m = new Choice();
m.setBounds(170,300,120,30);
m.add("CSE");
m.add("AI");
m.add("MECH");
m.add("CIVIL");
m.add("ENTC");
m.add("ELECRIC");
add(m);

Label l5 = new Label("Favorite Food --");
l5.setBounds(30,350,120,30);
add(l5);

List n = new List(3,true);
n.setBounds(170,350,120,30);
n.add("Pizza");
n.add("Burger");
n.add("Dosa");
n.add("Idli");
n.add("Vada Pav");
add(n);

Button b1 = new Button("Submit");
b1.setBounds(200,450,100,30);
add(b1);

Button b2 = new Button("Clear");
b2.setBounds(500,450,100,30);
add(b2);

Color o= new Color(255,0,0);
setBackground(o);
}
public static void main(String[] args)
{
Name1 f = new Name1();
}
}