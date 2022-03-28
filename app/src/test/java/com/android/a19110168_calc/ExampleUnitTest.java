package com.android.a19110168_calc;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.math.BigInteger;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for the add
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void zeroAddZeroIsZero() {
        double resultAdd = mCalculator.add(0d, 0d);
        assertThat(resultAdd, is(equalTo(0d)));
    }
    @Test
    public void negativeTwoAddMinusTwoIsMinusFour() {
        double resultAdd = mCalculator.add(-2d, -2d);
        assertThat(resultAdd, is(equalTo(-4d)));
    }

    @Test
    public void addition_isCorrect()
    {

        assertEquals(4, 2 + 2);
    }
    /**
     * Test for the subtraction
     */
    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }
    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }
    @Test
    public void subWorksWithBothNegativeResult() {
        double resultSub = mCalculator.sub(-1d, -17d);
        assertThat(resultSub, is(equalTo(16d)));
    }
    @Test
    public void oneSubMinusTwoIsThree() {
        double resultSub = mCalculator.sub(1d, -2d);
        assertThat(resultSub, is(equalTo(3d)));
    }
    @Test
    public void minusOneSubTwoIsNegativeThree() {
        double resultSub = mCalculator.sub(-1d, 2d);
        assertThat(resultSub, is(equalTo(-3d)));
    }
    /**
     * Test for the multiplication
     */
    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }
    @Test
    public void twoMulZeroIsZero() {
        double resultMul = mCalculator.mul(2d, 0d);
        assertThat(resultMul, is(equalTo(0d)));
    }
    @Test
    public void halfMulHalfIsAFourth() {
        double resultMul = mCalculator.mul(0.5d, 0.5d);
        assertThat(resultMul, is(equalTo(0.25d)));
    }
    @Test
    public void minusHalfMulHalfIsMinusAFourth() {
        double resultMul = mCalculator.mul(-0.5d, 0.5d);
        assertThat(resultMul, is(equalTo(-0.25d)));
    }
    @Test
    public void minusHalfMulMinusHalfIsAFourth() {
        double resultMul = mCalculator.mul(-0.5d, -0.5d);
        assertThat(resultMul, is(equalTo(0.25d)));
    }


    /**
     * Test for the division
     */
    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }
    @Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }
    @Test
    public void halfDivHalfIsOne() {
        double resultDiv = mCalculator.div(0.5d,0.5d);
        assertThat(resultDiv, is(equalTo(1d)));
    }
    @Test
    public void minusHalfDivMinusHalfIsOne() {
        double resultDiv = mCalculator.div(-0.5d,-0.5d);
        assertThat(resultDiv, is(equalTo(1d)));
    }
    @Test
    public void minusHalfDivHalfIsMinusOne() {
        double resultDiv = mCalculator.div(-0.5d,0.5d);
        assertThat(resultDiv, is(equalTo(-1d)));
    }

    /***
     * test for the pow
     */
    @Test
    public void ZeroPowZeroIsOne(){
        double resultFactorial = mCalculator.pow(0d,0d);
        assertThat(resultFactorial, is(equalTo(1d)));
    }
    @Test
    public void OnePowZeroIsOne(){
        double resultFactorial = mCalculator.pow(1d,0d);
        assertThat(resultFactorial, is(equalTo(1d)));
    }
    @Test
    public void OnePowTwoIsOne(){
        double resultFactorial = mCalculator.pow(1d,2d);
        assertThat(resultFactorial, is(equalTo(1d)));
    }
    @Test
    public void FourPowMinusOneIsAFourth(){
        double resultFactorial = mCalculator.pow(4d,-1d);
        assertThat(resultFactorial, is(equalTo(0.25d)));
    }
    @Test
    public void minusTwoPowMinusOneIsNegativeHalf(){
        double resultFactorial = mCalculator.pow(-2d,-1d);
        assertThat(resultFactorial, is(equalTo(-0.5d)));
    }


    /***
     * test for the factorial
     */
    @Test
    public void ZeroFactorialIsOne(){
        long resultFactorial = mCalculator.factorial((int)0d);
        assertThat(resultFactorial, is(equalTo(1l)));
    }
    @Test
    public void OneFactorialIsOne(){
        long resultFactorial = mCalculator.factorial((int)1d);
        assertThat(resultFactorial, is(equalTo((long)1d)));
    }
    @Test
    public void TwoFactorialIsTwo(){
        long resultFactorial = mCalculator.factorial((int)2d);
        assertThat(resultFactorial, is(equalTo((long)2d)));
    }
    @Test
    public void ThreeFactorialIsSix(){
        long resultFactorial = mCalculator.factorial((int)3d);
        assertThat(resultFactorial, is(equalTo((long)6d)));
    }
    // 0 is overvalued
    @Test
    public void MaxValueFactorialIsOvervalued(){
        long resultFactorial = mCalculator.factorial((int)21d);
        assertThat(resultFactorial, is(equalTo((long)0d)));
    }
    /***
     * test for the logarithm
     */
    // b is any number
    @Test
    public void logarithBaseBOfOneIsZero(){
        double resultFactorial = mCalculator.logarith(12d, 1d);
        assertThat(resultFactorial, is(equalTo(0d)));
    }
    @Test
    public void logarithBaseBOfBIsOne(){
        double resultFactorial = mCalculator.logarith(12d, 12d);
        assertThat(resultFactorial, is(equalTo(1d)));
    }
    @Test
    public void logarithBaseTwoOfFourIsTwo(){
        double resultFactorial = mCalculator.logarith(2d, 4d);
        assertThat(resultFactorial, is(equalTo(2d)));
    }
    @Test
    public void logarithBaseHalfOfTwoIsMinusOne(){
        double resultFactorial = mCalculator.logarith(0.5d, 2d);
        assertThat(resultFactorial, is(equalTo(-1d)));
    }
    @Test
    public void logarithBaseFourOfTwoIsHalf(){
        double resultFactorial = mCalculator.logarith(4d, 2d);
        assertThat(resultFactorial, is(equalTo(0.5d)));
    }



}