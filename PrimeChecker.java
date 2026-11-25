public class PrimeChecker {
private int randomPrime;
private int count;
private int numInput;
private int num1;
private int num2;
private int depth;
private boolean isPrime;
private boolean isEven;
private boolean isOdd;
private String allPrimes;

// List of Primes checks and prints each prime number from num1 inclusive to num2 inclusive
// (simply looping by the absolute-value distance of num1 and num2 and checking each number 
// by dividing up to the depth 
// and starting the increment from the smaller or equal number)
// if PrimeCheck is true, it adds that value with a space, and it repeatedly calls primecheck with its own parameters
public void ListOfPrimesFrom(int num1, int num2, int depth) {

this.num1 = num1;
this.num2 = num2;
this.depth = depth;
this.allPrimes = allPrimes;

}
// RandomizerPrime picks a number from 1 to 100 and correspondingly picks the 1st to 100th prime and prints it
// It does this by generating numbers from 1 to 100 until PrimeCheck approves one and returns that, with 50 depth
public void RandomizerPrime() {
this.randomPrime = randomPrime;
this.randomPrime = ((int)((Math.random() * 25) + 1));

while (!(PrimeCheck(this.randomPrime, 5))) {
this.randomPrime = ((int)((Math.random() * 25) + 1));
}
System.out.println(this.randomPrime);
}
// PrimeCheck repeatedly dividies an input by increments of one for as long as its depth demands
// once depth has been exhausted, it checks for any clean dividends
// if there any besides the input anmd 1, it is not prime, otherwise it is
public boolean PrimeCheck(int numInput, int depth) {
this.isPrime = isPrime;
this.isPrime = false;
this.depth = depth;
this.numInput = numInput;
if (!(EvenCheck(this.numInput))) {
for (int i = 2; i <= this.depth; i++)
if (this.numInput % i == 0) {
this.isPrime = false;
i += this.depth;
} else {
this.isPrime = true;
} 
}
return isPrime;
}

// To be efficient, evencheck is called within primecheck first
public boolean EvenCheck(int numInput) {
this.numInput = numInput;
this.isEven = isEven;
this.isOdd = isOdd;
if (numInput % 2 == 0) {
this.isEven = true;
}
return isEven;




}
// oddcheck takes any not even, not prime values generated to be odd (if you were to call prime check, 
// it could still tell you if a number is odd or even
public void OddCheck(int numInput) {
this.numInput = numInput;

}
}
