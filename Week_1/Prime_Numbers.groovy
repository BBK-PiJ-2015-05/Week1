/*
* 4: Prime numbers
* users are prompted for an integer and the absolute is tested to see if it is prime
*/
System.out.println("Please enter a number.")
String str = System.console().readLine()
int i = Integer.parseInt(str).abs()
int n = 2
boolean isPrime = true
while (n < i){
	if((i % n) == 0){
		isPrime = false
	}
n++
}
if (isPrime == true){
	System.out.println"The number " + i + " is a prime number."
} else{
	System.out.println"The number " + i + " is not a prime number."
}