package com.orderservice.orderservice.product;

import com.orderservice.orderservice.product.domain.DiscountPolicy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DiscountPolicyTest {

    @Test
    void applyDiscount() {
        final int price = 1000;
        final int discountedPrice = DiscountPolicy.NONE.applyDiscount(price);

        assertThat(discountedPrice).isEqualTo(price);
    }

    @Test
    void fix_1000_discount_price() {
        final int price = 2000;

        final int discountPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void over_discounted_price() {
        final int price = 500;

        final int discountPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        assertThat(discountPrice).isEqualTo(0);
    }
}