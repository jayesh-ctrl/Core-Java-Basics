import java.util.ArrayList;

class Customer{
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double initialAmount)
    {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount)
    {
        this.transactions.add(amount);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Double> getTransactions()
    {
        return transactions;
    }
}

class Branch{
    private String name;
    private ArrayList<Customer> customer;

    public Branch(String name)
    {
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customer;
    }
    public boolean newCustomer(String customerName,double initialAmount)
    {
        if(findCustomer(customerName)==null)
        {
            this.customer.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName,double amount)
    {
    
        
            Customer existingCustomer = findCustomer(customerName);
            if(existingCustomer!=null)
            {
                existingCustomer.addTransaction(amount);
                return true;
            }
            return false;

    }

    private Customer findCustomer(String customerName)
    {
        for(int i=0;i<this.customer.size();i++)
        {
            Customer checkedCustomer = this.customer.get(i);
            if(checkedCustomer.getName().equals(customerName))
            {
                return checkedCustomer;
            }
        }
        return null;
    }
}

class Bank{
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name)
    {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName)
    {
        if(findBranch(branchName)==null)
        {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }
    

    public boolean addCustomerTransaction(String branchName,String customerName,double amount)
    {
        Branch branch = findBranch(branchName);
        if(branch!=null)
        {
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    private Branch findBranch(String branchName)
    {
        for(int i=0;i<this.branches.size();i++)
        {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName))
            {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName,boolean showTransactions)
    {
        Branch branch=findBranch(branchName);
        if(branch!=null)
        {
            System.out.println("Customer details for Branch "+branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++)
            {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: "+branchCustomer.getName()+"["+i+"]");
                if(showTransactions)
                {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0;j<transactions.size();j++)
                    {
                        System.out.println("["+(j+1)+"] Amount "+transactions.get(j));
                    }

                }
            }
            return true;
        }
        else{
            return false;
        }
        // return false;
    }
}
public class Bank1 {
    public static void main(String []args)
    {
        Bank bank=new Bank("National Bank");
        if(bank.addBranch("India"))
        {
            System.out.println("India branch created");
        }
        bank.addCustomer("India","Jayesh",23.90);
        bank.addCustomer("India","Mahesh",175.50);
        bank.addCustomer("India","Pretty",220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",56.89);


        bank.addCustomerTransaction("India","Jayesh",20.0);
        bank.addCustomerTransaction("India","Jayesh",12.0);
        bank.addCustomerTransaction("India","Mahesh",1.65);

        bank.listCustomers("India",true);
        bank.listCustomers("Sydney", true);


        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brian", 5.53))
        {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("India"))
        {
            System.out.println("India Branch already exists");
        }

        if(!bank.addCustomerTransaction("India", "Fergus", 52.33))
        {
            System.out.println("Customer does not exist at Branch");
        }

        if(!bank.addCustomer("India", "Jayesh", 12.21))
        {
            System.out.println("Customer Jayesh already exists");
        }
    }

    
    
}
