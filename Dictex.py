a ={1:"first_name",2:"last_name","age":20}
print(a)
print(a["age"])
a["age"]=25
print(a)
x ={"coursel","coursel2","coursel3"}
print(type(x))
set1 ={"SITCOE"}
print(set1)
s2=set("SITCOE")
print(s2)
s3 =set(["SITCOE"])
print(s3)
s4=set(["SITCOE","Hello","SITCOE"])
print(s4)
Fruitset={"Apple","Banana","Grapes"}
print(Fruitset)
#Fruitset=frozenset(Fruitset)
Fruitset.add("Mango")
print(Fruitset)
a = True
print(type(a))
prime_numbers=[2,3,5,7]
byte_array=bytes(prime_numbers)
print(byte_array)
#byte_array.append(11)
byte_array=bytearray(prime_numbers)
byte_array.append(11)
print(byte_array)
random_byte_array = bytearray('ABC','utf-8')
mv=memoryview(random_byte_array)
print(mv[0])
prime_numbers=[2,3,5,7]
prime_numbers=bytearray(prime_numbers)
mv =memoryview(prime_numbers)
print(mv[0])