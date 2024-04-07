class Voting_Eligibility
{
  public static void main(String[]args)
   {
    int age=23;
    String result=(age>18)?("Eligible for voting"):("Not eligible for voting");
    System.out.println(age+" "+result);
   }
}

/* Output
CT: success;
RT: success: 23 Eligible for voting
*/