package testAmazon;

import org.openqa.selenium.By;

public class MainTest extends BaseTest {
	
	public void Test() {
	//open today's deals
	driver.findElement(By.xpath(mt_loc.getProperty("todays_deals"))).click();
	// discounts on credit cards
	driver.findElement(By.xpath(mt_loc.getProperty("discounts_cc"))).click();
	// enable credit/debit cards
	driver.findElement(By.xpath(mt_loc.getProperty("enable_cards"))).click();
	//hdfc discount details
	driver.findElement(By.xpath(mt_loc.getProperty("hdfc_discount"))).click();
	//bank of baroda discount details
	driver.findElement(By.xpath(mt_loc.getProperty("bob_discount"))).click();
	//icici discount details
	driver.findElement(By.xpath(mt_loc.getProperty("icici_discount"))).click();
	//onecard discount details
	driver.findElement(By.xpath(mt_loc.getProperty("onecard_discount"))).click();
	// click on continue shopping
	driver.findElement(By.xpath(mt_loc.getProperty("continue_shopping"))).click();
	//click on rewards
	driver.findElement(By.xpath(mt_loc.getProperty("rewards"))).click();
	//amazon Upi Offer
	driver.findElement(By.xpath(mt_loc.getProperty("amazon_upi"))).click();
	//collect amazon Upi Offer
	driver.findElement(By.xpath(mt_loc.getProperty("collect_amazon_upi_offer"))).click();
	//buy using amazon Upi Offer
	driver.findElement(By.xpath(mt_loc.getProperty("buy_amazon_upi_offer"))).click();
	//amazon pay rewards
	driver.findElement(By.xpath(mt_loc.getProperty("amazon_pay_rewards"))).click();
	//collect prime rewards
	driver.findElement(By.xpath(mt_loc.getProperty("collect_prime_rewards1"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("collect_prime_rewards2"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("collect_prime_rewards3"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("collect_prime_rewards4"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("collect_prime_rewards5"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("collect_prime_rewards6"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("collect_prime_rewards7"))).click();
	//buy using prime rewardsdriver.findElement(By.xpath(mt_loc.getProperty("collect_prime_rewards1"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("buy_prime_rewards1"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("buy_prime_rewards2"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("buy_prime_rewards3"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("buy_prime_rewards4"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("buy_prime_rewards5"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("buy_prime_rewards6"))).click();
	driver.findElement(By.xpath(mt_loc.getProperty("buy_prime_rewards7"))).click();	
	//buy using exchange offer
	driver.findElement(By.xpath(mt_loc.getProperty("exchange_offer"))).click();
	//How to avail exchange offer
	driver.findElement(By.xpath(mt_loc.getProperty("avail_exchange_offer"))).click();
	//Mobile exchange offer
	driver.findElement(By.xpath(mt_loc.getProperty("mobile_exchange_offer"))).click();
	//click on prime 
	driver.findElement(By.xpath(mt_loc.getProperty("mobile_prime"))).click();
	//delivery day
	//get it by tomorrow
	driver.findElement(By.xpath(mt_loc.getProperty("mobile_delivery_tomorrow"))).click();
	//get it in 2 days
	driver.findElement(By.xpath(mt_loc.getProperty("mobile_delivery_2days"))).click();
	//customer reviews
	//4 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("mobile_customer_reviews4"))).click();
	//3 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("mobile_customer_reviews3"))).click();
	//2 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("mobile_customer_reviews2"))).click();
	//1 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("mobile_customer_reviews1"))).click();
	//Electronics exchange offer
	driver.findElement(By.xpath(mt_loc.getProperty("electronics_exchange"))).click();
	//Kitchen Appliances exchange offer
	driver.findElement(By.xpath(mt_loc.getProperty("kitchen_appliances_exchange"))).click();
	//click on prime 
	driver.findElement(By.xpath(mt_loc.getProperty("kitchen_appliances_prime"))).click();
	//customer reviews
	//4 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("kitchen_appliances_customer_reviews4"))).click();
	//3 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("kitchen_appliances_customer_reviews3"))).click();
	//2 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("kitchen_appliances_customer_reviews2"))).click();
	//1 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("kitchen_appliances_customer_reviews1"))).click();
	//Televisions exchange offer
	driver.findElement(By.xpath(mt_loc.getProperty("televisions_exchange_offer"))).click();
	//click on prime 
	driver.findElement(By.xpath(mt_loc.getProperty("televisions_prime"))).click();
	//customer reviews
	//4 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("televisions_customer_reviews4"))).click();
	//3 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("televisions_customer_reviews3"))).click();
	//2 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("televisions_customer_reviews2"))).click();
	//1 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("televisions_customer_reviews1"))).click();
	//Home Appliances exchange offer
	driver.findElement(By.xpath(mt_loc.getProperty("home_appliances_exchange_offer"))).click();
	//click on prime 
	driver.findElement(By.xpath(mt_loc.getProperty("home_appliances_prime"))).click();
	//customer reviews
	//4 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("home_appliances_customer_reviews4"))).click();
	//3 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("home_appliances_customer_reviews3"))).click();
	//2 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("home_appliances_customer_reviews2"))).click();
	//1 star and up
	driver.findElement(By.xpath(mt_loc.getProperty("home_appliances_customer_reviews1"))).click();				
	//back to top
	driver.findElement(By.xpath(mt_loc.getProperty("back_to_top"))).click();
		
	}

}
