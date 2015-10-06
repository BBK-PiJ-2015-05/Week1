/*
* 17. Optimus Prime
* prints the closest prime to the inputted number
*/

//test for valid number
print "Tell me a number: "
String str = System.console().readLine()
while(!str.isInteger()){
    println "Please enter a valid number"
    str = System.console().readLine()
}
int num  = Integer.parseInt(str)
boolean isPrime = false
int i
int highPrime = 0
int lowPrime = 0
int count
for (i = 1; i < num; i++){
    count = 0
    for (int n = 2; n < i; n++){
        if((i % n) == 0){
            count++
        }
    }
    if (count == 0){
        lowPrime = i
    }
}

i = num
while(!isPrime){
    count = 0
    for (int n = 2; n < i; n++){
        if((i % n) == 0){
            count++
        }
    }
    if (count == 0){
        highPrime = i
        isPrime = true
        break
    }
    i++
}

if((num - lowPrime) == (highPrime - num)){
    println"The nearest two primes are " + lowPrime + " and " + highPrime
}else if ((num - lowPrime) > (highPrime - num)){
    println"The nearest prime is " + highPrime
}else{
    println "The nearest prime is " + lowPrime
}