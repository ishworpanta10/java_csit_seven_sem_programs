package accountmanagement;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AccountManagement {

    public static final List<Account> accounts = new LinkedList<>();

    public static void main(String[] args) {

        int balance, acId = 0;
        Long zxc = 1L, balanceTotal = 1L, abc = 1L;
        char cont = 'n';
        Scanner sc = new Scanner(System.in);

        Account accountOne = new Account();
        accountOne.setHolderName("zxc");
        accountOne.setAccountType("saving");
        accountOne.setId(2);
        accountOne.setBalance(100000L);
        accounts.add(accountOne);
        
        Account accountTwo = new Account();
        accountTwo.setHolderName("abc");
        accountTwo.setAccountType("loan");
        accountTwo.setId(3);
        accountTwo.setBalance(400000L);

        accounts.add(accountTwo);
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Create an Account");
            System.out.println("2. Deposid Balance");
            System.out.println("3. Withdraw Balance");
            System.out.println("4. Check Account Status");
            System.out.println("5. Check Account All Detail");
            System.out.println("==========================");
            int choice = 4;
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("===   Create Account   ===");

                    System.out.println("Enter Name");//name
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Select Account Type \n 1 for Saving \n 2 for Loan");//type
                    int type = sc.nextInt();

                    String acType = "Saving";

                    switch (type) {
                        case 1:
                            acType = "Saving";
                            break;
                        case 2:
                            acType = "Loan";
                            break;
                        default:
                            acType = "Saving";
                            break;
                    }
                    System.out.println("Enter Account Number :");
                    int acNumber = sc.nextInt();
                    System.out.println("Enter Account Balance"); // Balance
                    Long acBalance = sc.nextLong();

                    accounts.add(new Account(acNumber, name, acType, acBalance));

                    for (Account a : accounts) {
                        System.out.println("-----------------------------------");
                        System.out.println("Name: " + a.getHolderName());
                        System.out.println("Account Number: " + a.getId());
                        System.out.println("Account Type: " + a.getAccountType());
                        System.out.println("Balance: " + a.getBalance());
                        System.out.println("-----------------------------------");
                    }

                    System.out.println("[ ACCOUNT CREATED ! ! ! ]");
                    break;

                case 2:
                    System.out.println("===   Deposti Balance   ===");
                    System.out.println("Enter your account Number");
                    int updateId = sc.nextInt();

                    int index = findOne(updateId);
                    Account AccountUpdate = findTwo(index);


                    if (AccountUpdate != null) {

                        System.out.println("Enter Account Balance"); // Balance
                        Long acBalanceUpdate = sc.nextLong();
                        for (Account a : accounts) {
                            if (accounts.indexOf(a) == index) {

                                zxc = a.getBalance();

                                balanceTotal = zxc + acBalanceUpdate;

                            }
                        }

                        AccountUpdate.setBalance(balanceTotal);
                        accounts.set(accounts.indexOf(AccountUpdate), AccountUpdate);
                        System.out.println("Update Balance !!");
                    } else {
                        System.out.println("[ 404: Account Not Found ! ]");
                    }

                    break;

                case 3:
                    System.out.println("===   Withdraw Balance   ===");
                    System.out.println("Enter your account Number");

                    int update2Id = sc.nextInt();
                    int index2 = findOne(update2Id);

                    Account Account2Update = findTwo(index2);

                    if (Account2Update != null) {

                        System.out.println("Enter Account Balance"); // Balance

                        Long acBalanceUpdate = sc.nextLong();

                        for (Account a : accounts) {

                            if (a.getId() == update2Id) {

                                zxc = a.getBalance();
                                abc = acBalanceUpdate;

                            }
                        }

                        if (zxc < acBalanceUpdate) {

                            System.out.println("Insufficent funds");

                        } else {

                            balanceTotal = zxc - acBalanceUpdate;
                        }

                        Account2Update.setBalance(balanceTotal);
                        accounts.set(accounts.indexOf(Account2Update), Account2Update);
                        System.out.println("Update Balance !!");
                    } else {
                        System.out.println("[ 404: Account Not Found ! ]");
                    }
                    break;

                case 4:
                    System.out.println("===   Check Account Status   ===");
                    System.out.println("Enter your account Number");

                    int update3Id = sc.nextInt();
                    int index3 = findOne(update3Id);
                    Account Account3Update = findTwo(index3);
                    System.out.println("============================================");
                    System.out.println("Name: " + Account3Update.getHolderName());
                    System.out.println("Account Number: " + Account3Update.getId());
                    System.out.println("Account Type :" + Account3Update.getAccountType());
                    System.out.println("Balance: " + Account3Update.getBalance());
                    System.out.println("============================================");

                    break;
                case 5:
                    System.out.println("===   All Account Details   ===");
                    for (Account a : accounts) {
                        System.out.println("=======================================");
                        System.out.println("Name: " + a.getHolderName());
                        System.out.println("Account Number: " + a.getId());
                        System.out.println("Account Type: " + a.getAccountType());
                        System.out.println("Balance: " + a.getBalance());
                        System.out.println("=======================================");
                    }
                    break;
                default:
                    System.out.println("===   Choice Error   ===");
                    break;
            }
            System.out.println("Back to Menu ?\n  (y/Y)YEs \n (n/N) NO");
            cont = sc.next().charAt(0);
        } while (cont == 'y' || cont == 'Y');

        for (Account a : accounts) {
            System.out.println("=======================================");
            System.out.println("Name: " + a.getHolderName());
            System.out.println("Account Number: " + a.getId());
            System.out.println("Account Type: " + a.getAccountType());
            System.out.println("Balance: " + a.getBalance());
            System.out.println("=======================================");
        }

    }

    static void test(Long zxc, Long abc) {
        Long z = 1L;
        if (zxc > abc) {

            System.out.println("Insufficent funds");

        } else {

            z = abc - zxc;

        }

    }

    static Integer findOne(int id) {
        Integer index = null;
        for (Account account : accounts) {
            if (account.getId() == id) {
                index = accounts.indexOf(account);
                break;
            }
        }
        return index;
    }

    static Account findTwo(int index2) {
        Account selectIndex = null;
        for (Account a : accounts) {
            if (accounts.indexOf(a) == index2) {
                selectIndex = a;
                break;
            }
        }
        return selectIndex;
    }
}
