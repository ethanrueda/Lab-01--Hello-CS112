public class Dog
{
//Instance variable
public String breed;

//Full Constructor
public Dog(String breed)
  {
  this.breed = breed;
  }

//ToString 
public String toString()
{
return ("Your dog's breed is " + this.breed);  
}

//Equals Statement
public boolean equals(Dog other)
{
  return this.breed.equals(other.breed);
}

//Mutator
public void setBreed(String breed)
  {
    this.breed = breed;
  }

//Acessor
public void getBreed(String breed)
  {
    this.breed = breed;
  }
  
}