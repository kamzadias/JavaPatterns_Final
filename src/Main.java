import Bridge.*;
import Bridge.Acer;
import Bridge.Lenovo;
import Bridge.MacBook;
import Builder.Computers.Manual;
import Builder.Director.Director;
import Decorator.BasicComputer;
import Decorator.LinuxComputerDecorator;
import Decorator.MacOSComputerDecorator;
import Decorator.WindowsComputerDecorator;
import Facade.*;
import Factory.*;
import Factory.Computer;
import Builder.*;
import Strategy.CashCustomer;
import Strategy.CreditCardCustomer;
import Strategy.Customer;
import Strategy.KaspiCustomer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ConsultantFacade consultantFacade = new ConsultantFacade();

        System.out.println("Welcome to 'Computer Planet' store. Our store offers you to buy a " +
                "ready-made computer or create your own. What is your goal?\n" +
                "1. Buy a ready-made computer\n" +
                "2. Create a new computer\n");
        int choice = in.nextInt();

        //BUY READY
        if(choice == 1){
            System.out.println("We have 3 models of computer." +
                    "To see more information, choose model of computer\n" +
                    "1. MacBook\n" +
                    "2. Acer\n" +
                    "3. Lenovo\n");

            int model = in.nextInt();

            //MacBook
            if(model == 1){
                consultantFacade.MacBookSale();
                System.out.println("\nNow you see computer type. Do you want to buy?\n" +
                        "1. Yes\n" +
                        "2. No");
                int buy = in.nextInt();

                //BuyMacBook
                if(buy == 1){
                    ComputerFactory factory = new MacBookFactory();
                    Computer macBook = factory.createComputer();
                    macBook.make();

                    System.out.println("Choose OS\n" +
                            "1. MacOS\n" +
                            "2. Windows\n" +
                            "3. Linux");

                    int OS = in.nextInt();

                    //MacBook MacOS
                    if(OS == 1){
                        Decorator.Computer computer = new BasicComputer();
                        Decorator.Computer macbook = new MacOSComputerDecorator(new BasicComputer());
                        System.out.println(macbook.printModel());

                        System.out.println("OS installed successfully");

                        System.out.println("Choose color and memory:\n" +
                                "1. Black + 1TB\n" +
                                "2. White + 1TB\n" +
                                "3. Black + 512GB\n" +
                                "4. White + 512GB\n");
                        int color = in.nextInt();

                        //MacBook1
                        if(color == 1){
                            Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            //MacBookPay1
                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();
                            }
                            //MacBookPay2
                            else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }
                            //MacBookPay2
                            else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                        //MacBook2
                        else if(color == 2){
                            Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            //MacBookPay1
                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }
                            //MacBookPay2
                            else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }
                            //MacBookPay3
                            else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                        //MacBook3
                        else if(color == 3){
                            Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            //MacBookPay1
                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }
                            //MacBookPay2
                            else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }
                            //MacBookPay3
                            else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                        //MacBook4
                        else if(color == 4){
                            Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            //MacBookPay1
                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }
                            //MacBookPay2
                            else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }
                            //MacBookPay3
                            else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                    }
                    //MacBook Windows
                    else if(OS == 2){
                        Decorator.Computer computer = new BasicComputer();
                        Decorator.Computer macbook = new WindowsComputerDecorator(new BasicComputer());
                        System.out.println(macbook.printModel());

                        System.out.println("OS installed successfully");

                        System.out.println("Choose color and memory:\n" +
                                "1. Black + 1TB\n" +
                                "2. White + 1TB\n" +
                                "3. Black + 512GB\n" +
                                "4. White + 512GB\n");
                        int color = in.nextInt();

                        if(color == 1){
                            Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 2){
                            Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 3){
                            Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 4){
                            Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                    }
                    //MacBook Linux
                    else if(OS == 3){
                        Decorator.Computer computer = new BasicComputer();
                        Decorator.Computer macbook = new LinuxComputerDecorator(new BasicComputer());
                        System.out.println(macbook.printModel());

                        System.out.println("OS installed successfully");


                        System.out.println("Choose color and memory:\n" +
                                "1. Black + 1TB\n" +
                                "2. White + 1TB\n" +
                                "3. Black + 512GB\n" +
                                "4. White + 512GB\n");
                        int color = in.nextInt();
                        if(color == 1){
                            Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();


                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();
                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }

                        }else if(color == 2){
                            Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();
                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }

                        }else if(color == 3){
                            Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }

                        }else if(color == 4){
                            Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                    }
                }
                //ElseBuyMacBook
                else if(buy == 2){
                    System.out.println("Stop, don't leave our store. We have more computer models!\n");

                    System.out.println("1. Acer\n");
                    consultantFacade.AcerSale();

                    System.out.println("--------------------------------");

                    System.out.println("2. Lenovo\n");
                    consultantFacade.LenovoSale();

                    System.out.println("\nDo you want to buy?\n" +
                            "1. Acer\n" +
                            "2. Lenovo\n" +
                            "3. Nothing");

                    int buyIPhone2 = in.nextInt();

                    if(buyIPhone2 == 1){
                        ComputerFactory factory = new AcerComputerFactory();
                        Computer acer = factory.createComputer();
                        acer.make();

                        System.out.println("Choose OS\n" +
                                "1. Windows\n" +
                                "2. Linux");
                        int OS = in.nextInt();

                        if(OS == 1){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer acer1 = new WindowsComputerDecorator(new BasicComputer());
                            System.out.println(acer1.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new Acer(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 2){
                                Bridge.Computer computer1 = new Acer(new WhiteColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new Acer(new BlackColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new Acer(new WhiteColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }else if(OS == 2){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer acer1 = new LinuxComputerDecorator(new BasicComputer());
                            System.out.println(acer1.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new Acer(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 2){
                                Bridge.Computer computer1 = new Acer(new WhiteColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 3){
                                Bridge.Computer computer1 = new Acer(new BlackColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new Acer(new WhiteColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }
                    }else if(buyIPhone2 == 2){
                        ComputerFactory factory = new LenovoComputerFactory();
                        Computer lenovo = factory.createComputer();
                        lenovo.make();

                        System.out.println("Choose OS\n" +
                                "1. Windows\n" +
                                "2. Linux");
                        int OS = in.nextInt();

                        if(OS == 1){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer lenovo1 = new WindowsComputerDecorator(new BasicComputer());
                            System.out.println(lenovo1.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new Lenovo(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 2){
                                Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new Lenovo(new BlackColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }else if(OS == 2){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer lenovo1 = new LinuxComputerDecorator(new BasicComputer());
                            System.out.println(lenovo1.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new Lenovo(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 2){
                                Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new Lenovo(new BlackColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }
                    }else if(buyIPhone2 == 3){
                        System.out.println("Good bye!");
                    }else{
                        System.out.println("Type correct number!");
                    }
                }
            }
            //Acer
            else if(model == 2){
                consultantFacade.AcerSale();

                System.out.println("\nNow you see computer type. Do you want to buy?\n" +
                        "1. Yes\n" +
                        "2. No");
                int buy = in.nextInt();

                if(buy == 1){
                    ComputerFactory factory = new AcerComputerFactory();
                    Computer acer = factory.createComputer();
                    acer.make();

                    System.out.println("Choose OS\n" +
                            "1. Windows\n" +
                            "2. Linux");
                    int OS = in.nextInt();
                    if(OS == 1){
                        Decorator.Computer computer = new BasicComputer();
                        Decorator.Computer acer1 = new WindowsComputerDecorator(new BasicComputer());
                        System.out.println(acer1.printModel());

                        System.out.println("OS installed successfully");

                        System.out.println("Choose color and memory:\n" +
                                "1. Black + 1TB\n" +
                                "2. White + 1TB\n" +
                                "3. Black + 512GB\n" +
                                "4. White + 512GB\n");
                        int color = in.nextInt();
                        if(color == 1){
                            Bridge.Computer computer1 = new Acer(new BlackColor(), new TB1());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 2){
                            Bridge.Computer computer1 = new Acer(new WhiteColor(), new TB1());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 3){
                            Bridge.Computer computer1 = new Acer(new BlackColor(), new GB512());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 4){
                            Bridge.Computer computer1 = new Acer(new WhiteColor(), new GB512());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                    }else if(OS == 2){
                        Decorator.Computer computer = new BasicComputer();
                        Decorator.Computer acer1 = new LinuxComputerDecorator(new BasicComputer());
                        System.out.println(acer1.printModel());

                        System.out.println("OS installed successfully");


                        System.out.println("Choose color and memory:\n" +
                                "1. Black + 1TB\n" +
                                "2. White + 1TB\n" +
                                "3. Black + 512GB\n" +
                                "4. White + 512GB\n");

                        int color = in.nextInt();
                        if(color == 1){
                            Bridge.Computer computer1 = new Acer(new BlackColor(), new TB1());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 2){
                            Bridge.Computer computer1 = new Acer(new WhiteColor(), new TB1());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();


                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();
                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 3){
                            Bridge.Computer computer1 = new Acer(new BlackColor(), new GB512());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 4){
                            Bridge.Computer computer1 = new Acer(new WhiteColor(), new GB512());
                            computer1.applyColor();

                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                    }
                }else if(buy == 2){
                    System.out.println("Stop, don't leave our store. We have more computer models!\n");

                    System.out.println("1. MacBook\n");
                    consultantFacade.MacBookSale();

                    System.out.println("--------------------------------");

                    System.out.println("2. Lenovo\n");
                    consultantFacade.LenovoSale();

                    System.out.println("\nDo you want to buy?\n" +
                            "1. MacBook\n" +
                            "2. Lenovo\n" +
                            "3. Nothing");

                    int buyIPhone2 = in.nextInt();

                    if(buyIPhone2 == 1){
                        ComputerFactory factory = new MacBookFactory();
                        Computer macBook = factory.createComputer();
                        macBook.make();

                        System.out.println("Choose OS\n" +
                                "1. MacOS\n" +
                                "2. Windows\n" +
                                "3. Linux");
                        int OS = in.nextInt();

                        if(OS == 1){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer macbook = new MacOSComputerDecorator(new BasicComputer());
                            System.out.println(macbook.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 2){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 3){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 4){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                                computer1.applyColor();
                            }
                        }else if(OS == 2){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer macbook = new WindowsComputerDecorator(new BasicComputer());
                            System.out.println(macbook.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 2){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 3){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 4){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }else if(OS == 3){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer macbook = new LinuxComputerDecorator(new BasicComputer());
                            System.out.println(macbook.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 2){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 3){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 4){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }
                    }else if(buyIPhone2 == 2){
                        ComputerFactory factory = new LenovoComputerFactory();
                        Computer lenovo = factory.createComputer();
                        lenovo.make();

                        System.out.println("Choose OS\n" +
                                "1. Windows\n" +
                                "2. Linux");
                        int OS = in.nextInt();

                        if(OS == 1){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer lenovo1 = new WindowsComputerDecorator(new BasicComputer());
                            System.out.println(lenovo1.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new Lenovo(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 2){
                                Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 3){
                                Bridge.Computer computer1 = new Lenovo(new BlackColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }

                            }else if(color == 4){
                                Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new GB512());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }else if(OS == 2){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer lenovo1 = new LinuxComputerDecorator(new BasicComputer());
                            System.out.println(lenovo1.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new Lenovo(new BlackColor(), new TB1());
                                computer1.applyColor();

                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 2){
                                Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new Lenovo(new BlackColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }
                    }else if(buyIPhone2 == 3){
                        System.out.println("Good bye!");
                    }else{
                        System.out.println("Type correct number!");
                    }
                }
            //LenovoChoice
            }
            //Lenovo
            else if(model == 3){
                consultantFacade.LenovoSale();

                System.out.println("\nNow you see computer type. Do you want to buy?\n" +
                        "1. Yes\n" +
                        "2. No");
                int buy = in.nextInt();
                if(buy == 1){
                    ComputerFactory factory = new LenovoComputerFactory();
                    Computer lenovo = factory.createComputer();
                    lenovo.make();

                    System.out.println("Choose OS\n" +
                            "1. Windows\n" +
                            "2. Linux");
                    int OS = in.nextInt();
                    if(OS == 1){
                        Decorator.Computer computer = new BasicComputer();
                        Decorator.Computer lenovo1 = new WindowsComputerDecorator(new BasicComputer());
                        System.out.println(lenovo1.printModel());

                        System.out.println("OS installed successfully");


                        System.out.println("Choose color and memory:\n" +
                                "1. Black + 1TB\n" +
                                "2. White + 1TB\n" +
                                "3. Black + 512GB\n" +
                                "4. White + 512GB\n");
                        int color = in.nextInt();
                        if(color == 1){
                            Bridge.Computer computer1 = new Lenovo(new BlackColor(), new TB1());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 2){
                            Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new TB1());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 3){
                            Bridge.Computer computer1 = new Lenovo(new BlackColor(), new GB512());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 4){
                            Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new GB512());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                    }else if(OS == 2){
                        Decorator.Computer computer = new BasicComputer();
                        Decorator.Computer lenovo1 = new LinuxComputerDecorator(new BasicComputer());
                        System.out.println(lenovo1.printModel());

                        System.out.println("OS installed successfully");

                       System.out.println("Choose color and memory:\n" +
                                "1. Black + 1TB\n" +
                                "2. White + 1TB\n" +
                                "3. Black + 512GB\n" +
                                "4. White + 512GB\n");
                        int color = in.nextInt();

                        if(color == 1){
                            Bridge.Computer computer1 = new Lenovo(new BlackColor(), new TB1());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 2){
                            Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new TB1());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 3){
                            Bridge.Computer computer1 = new Lenovo(new BlackColor(), new GB512());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }else if(color == 4){
                            Bridge.Computer computer1 = new Lenovo(new WhiteColor(), new GB512());
                            computer1.applyColor();
                            System.out.println("Memory and Color installed successfully");

                            System.out.println();

                            System.out.println("Choose paying method\n" +
                                    "1. Kaspi\n" +
                                    "2. Credit Card\n" +
                                    "3. Cash");
                            int pay = in.nextInt();

                            if(pay == 1){
                                Customer kaspi = new KaspiCustomer();
                                kaspi.Pay();

                            }else if(pay == 2){
                                Customer creditCard = new CreditCardCustomer();
                                creditCard.Pay();
                            }else if(pay == 3){
                                Customer cash = new CashCustomer();
                                cash.Pay();
                            }
                        }
                    }
                }else if(buy == 2){
                    System.out.println("Stop, don't leave our store. We have more computer models!\n");

                    System.out.println("1. Acer\n");
                    consultantFacade.AcerSale();

                    System.out.println("--------------------------------");

                    System.out.println("2. MacBook\n");
                    consultantFacade.MacBookSale();

                    System.out.println("\nDo you want to buy?\n" +
                            "1. Acer\n" +
                            "2. MacBook\n" +
                            "3. Nothing");
                    int buyIPhone2 = in.nextInt();

                    if(buyIPhone2 == 1){
                        ComputerFactory factory = new AcerComputerFactory();
                        Computer acer = factory.createComputer();
                        acer.make();

                        System.out.println("Choose OS\n" +
                                "1. Windows\n" +
                                "2. Linux");
                        int OS = in.nextInt();

                        if(OS == 1){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer acer1 = new WindowsComputerDecorator(new BasicComputer());
                            System.out.println(acer1.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new Acer(new BlackColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 2){
                                Bridge.Computer computer1 = new Acer(new WhiteColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new Acer(new BlackColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new Acer(new WhiteColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }else if(OS == 2){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer acer1 = new LinuxComputerDecorator(new BasicComputer());
                            System.out.println(acer1.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new Acer(new BlackColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 2){
                                Bridge.Computer computer1 = new Acer(new WhiteColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new Acer(new BlackColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new Acer(new WhiteColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }
                    }else if(buyIPhone2 == 2){
                        ComputerFactory factory = new MacBookFactory();
                        Computer macBook = factory.createComputer();
                        macBook.make();

                        System.out.println("Choose OS\n" +
                                "1. MacOS\n" +
                                "2. Windows\n" +
                                "3. Linux");
                        int OS = in.nextInt();


                        if(OS == 1){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer macbook = new MacOSComputerDecorator(new BasicComputer());
                            System.out.println(macbook.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 2){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }else if(OS == 2){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer macbook = new WindowsComputerDecorator(new BasicComputer());
                            System.out.println(macbook.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 2){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }else if(OS == 3){
                            Decorator.Computer computer = new BasicComputer();
                            Decorator.Computer macbook = new LinuxComputerDecorator(new BasicComputer());
                            System.out.println(macbook.printModel());

                            System.out.println("OS installed successfully");

                            System.out.println("Choose color and memory:\n" +
                                    "1. Black + 1TB\n" +
                                    "2. White + 1TB\n" +
                                    "3. Black + 512GB\n" +
                                    "4. White + 512GB\n");
                            int color = in.nextInt();
                            if(color == 1){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 2){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new TB1());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 3){
                                Bridge.Computer computer1 = new MacBook(new BlackColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }else if(color == 4){
                                Bridge.Computer computer1 = new MacBook(new WhiteColor(), new GB512());
                                computer1.applyColor();
                                System.out.println("Memory and Color installed successfully");

                                System.out.println();

                                System.out.println("Choose paying method\n" +
                                        "1. Kaspi\n" +
                                        "2. Credit Card\n" +
                                        "3. Cash");
                                int pay = in.nextInt();

                                if(pay == 1){
                                    Customer kaspi = new KaspiCustomer();
                                    kaspi.Pay();

                                }else if(pay == 2){
                                    Customer creditCard = new CreditCardCustomer();
                                    creditCard.Pay();
                                }else if(pay == 3){
                                    Customer cash = new CashCustomer();
                                    cash.Pay();
                                }
                            }
                        }
                    }else if(buyIPhone2 == 3){
                        System.out.println("Good bye!");
                    }else{
                        System.out.println("Type correct number!");
                    }
                }
            }
            else{
                System.out.println("Sorry, choose correct model and type its number");
            }
        }
        //MAKE COMPUTER
        else if(choice == 2){
            System.out.println("Choose what type of computer do you need.\n" +
                    "1. Gaming\n" +
                    "2. Office");
            int type = in.nextInt();

            if(type == 1){
                Director director = new Director();

                ComputerManualBuilder manualBuilder = new ComputerManualBuilder();

                director.constructGamingComputer(manualBuilder);
                Manual computerManual = manualBuilder.getResult();
                System.out.println("\nComputer manual built:\n" + computerManual.print());

            }else if(type == 2){
                Director director = new Director();

                ComputerManualBuilder manualBuilder = new ComputerManualBuilder();

                director.constructOfficeComputer(manualBuilder);
                Manual computerManual = manualBuilder.getResult();
                System.out.println("\nComputer manual built:\n" + computerManual.print());
            }

        }
        else{
            System.out.println("Write the correct number and try again");
        }
    }
}