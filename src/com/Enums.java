/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Tareq
 */
public class Enums {
    public static enum StateRep{
        OrderCancelReject(0),
        InAppia(1),
        InFix(2),
        RejectAppia(3),
        RejectFix(4),
        AppiaExpired(5),
        ;
        int value;
        StateRep(int value){
            this.value = value;
        }
    }
    public static enum ReplyState{
        START,
        FINISH
    }    
    public static enum TransactionType{
        nil,
        NewOrderWithConfirmation,
        NewOrderWithoutConfirmation,
        PlaceOrder,
        CreateNewOrder,
        CancelOrder,
        ModifyOrder;
    }
    public static enum KwOrderType {
        Unknown(0),
        Market(1), //
        Limit(2),
        StopLoss(3),
        StopLimit(4);
        int value;
        KwOrderType(int value) {
            this.value = value;
        }
        KwOrderType() {
            this.value = 0;
        }        
        @Override
        public String toString() {
            return "" + this.value;
        }

        public int toInteger() {
            return this.value;
        }
        //convert ETP Operation
        public static String toEtpOrderType(KwOrderType v){
            switch(v){
                case Market:
                    return "15";
                case Limit:
                    return "16";
                case StopLoss:
                    return "17";
                case StopLimit:
                    return "18";
                default:
                    return null;
            }
        }        

        public static KwOrderType fromEtpOrderType(String v){
            switch(v){
                case "15":
                    return KwOrderType.Market;
                case "16":
                    return KwOrderType.Limit;
                case "17":
                    return KwOrderType.StopLoss;
                case "18":
                    return KwOrderType.StopLimit;
                default:
                    return KwOrderType.Unknown;
            }
        }        
        public static KwOrderType fromString(String v){
            switch(v){
                case "Market":
                    return KwOrderType.Market;
                case "Limit":
                    return KwOrderType.Limit;
                case "StopLoss":
                    return KwOrderType.StopLoss;
                case "StopLimit":
                    return KwOrderType.StopLimit;
                default:
                    return KwOrderType.Unknown;
            }
        }
        public static KwOrderType fromInt(int v){
            switch(v){
                case 1:
                    return KwOrderType.Market;
                case 2:
                    return KwOrderType.Limit;
                case 3:
                    return KwOrderType.StopLoss;
                case 4:
                    return KwOrderType.StopLimit;

                default:
                    return KwOrderType.Unknown;
            }
        }

    }
    public static enum Side {
        Unknown(0),
        Buy(1),
        Sell(2);
        public static Side fromEtpSide(String v){
            switch(v){
                case "13":
                    return Side.Buy;
                case "14":
                    return Side.Sell;
                default:
                    return Side.Unknown;
            }
        }        
        public static String toEtpSide(Side v){
            switch(v){
                case Buy:
                    return "13";
                case Sell:
                    return "14";
                default:
                    return null;
            }
        }        

        public static Side fromString(String toString) {
            switch(toString){
                case "Buy":
                    return Side.Buy;
                case "Sell":
                    return Side.Sell;
                default:
                    return Side.Unknown;
            }
        }
        int value;
        Side(int value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "" + this.value;
        }
        public int toInteger() {
            return this.value;
        }
        public static Side fromInt(int v){
            switch(v){
                case 1:
                    return Side.Buy;
                case 2:
                    return Side.Sell;
                default:
                    return Side.Unknown;
            }
        }
    }
    //OrdRejReason
    public static enum OrdRejReason {
        UnknownOrder(5), // Unknown order 
        DuplicateOrder (6), //Duplicate order (e.g. duplicate CLOrdID) 
        Other(99); //Other.  Refer to returned Text (58) field for exact reason for rejection
        int value;
        OrdRejReason(int value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "" + this.value;
        }
        public int toInteger() {
            return this.value;
        }
        public static OrdRejReason fromInteger(int o){
                //int o = Integer.parseInt(v);
                switch(o){
                    case 0:
                        return OrdRejReason.UnknownOrder;
                    case 1:
                        return OrdRejReason.DuplicateOrder;
                    case 2:
                        return OrdRejReason.Other;
                    default:
                        return OrdRejReason.Other;
                }
            
        }
    }
    //OrdStatus
    public static enum OrdStatus {
        nil(-1),
        New(0),
        PartiallyFilled (1), // Partially filled 
        Filled (2),//Filled 
        Cancelled (4),// Cancelled  
        Replaced (5),//  Replaced 
        Rejected(8), 
        Suspended (9), //Suspended (Not supported) 
        PendingNew("A"), //Pending New (used only for vetting by X-stream)
        Expired("C"),
        //*** NASDAQ OMX Defined ***
        Unplaced("U"), // Order is Unplaced 
        OrderWithTrigger("X"), //  Order with trigger in the book but not active (e.g. Order has not been triggered)
        PrivateOrder("Z"); // Private Order 
        int value=-1;
        String svalue;
        OrdStatus(String value) {
            this.svalue = value;
        }
        OrdStatus(int value) {
            this.value = value;
        }
        OrdStatus() {
            this.value = 0;
        }        
        @Override
        public String toString() {
            return "" + (this.value!=-1?this.value:this.svalue);
        }
        public int toInteger() {
            return (this.value!=-1?this.value:-1);
        }
        public static OrdStatus fromString(String v){
            try{
                int o = Integer.parseInt(v);
                switch(o){
                    case 0:
                        return OrdStatus.New;
                    case 1:
                        return OrdStatus.PartiallyFilled;
                    case 2:
                        return OrdStatus.Filled;
                    case 4:
                        return OrdStatus.Cancelled;
                    case 5:
                        return OrdStatus.Replaced;
                    case 8:
                        return OrdStatus.Rejected;
                    case 9:
                        return OrdStatus.Suspended;
                    default:
                        return OrdStatus.nil;
                }

            }catch(Exception ex){
                switch(v){
                    case "A":
                        return OrdStatus.PendingNew;
                    case "C":
                        return OrdStatus.Expired;
                    case "U":
                        return OrdStatus.Unplaced;
                    case "X":
                        return OrdStatus.OrderWithTrigger;
                    case "Z":
                        return OrdStatus.PrivateOrder;
                    default:
                        return OrdStatus.nil;
                }
            }
        }    
    }

    //ExecType 
    public static enum ExecType {
        nil(-1),
        New(0),
        Doneforday (3), // Done for day
        Cancelled(4),//Cancelled
        Replaced(5),// Replaced 
        PendingCancel(6),//  (e.g. result of Order Cancel Request)
        Stopped(7), 
        Rejected(8), 
        Suspended(9), 
        Expired("C"),
        Trade("F"), //Trade (partial fill or fill) 
        TradeCancel("H"), // Trade Cancel 
        OrderStatus("I"); //Order Status
        int value=-1;
        String svalue;
        ExecType(String value) {
            this.svalue = value;
        }
        ExecType(int value) {
            this.value = value;
        }
        ExecType() {
            this.value = 0;
        }        
        @Override
        public String toString() {
            return "" + (this.value!=-1?this.value:this.svalue);
        }
        public int toInteger() {
            return (this.value!=-1?this.value:-1);
        }
        public static ExecType fromString(String v){
            try{
                int o = Integer.parseInt(v);
                switch(o){
                    case 0:
                        return ExecType.New;
                    case 3:
                        return ExecType.Doneforday;
                    case 4:
                        return ExecType.Cancelled;
                    case 5:
                        return ExecType.Replaced;
                    case 6:
                        return ExecType.PendingCancel;
                    case 7:
                        return ExecType.Stopped;
                    case 8:
                        return ExecType.Rejected;
                    case 9:
                        return ExecType.Suspended;
                    default:
                        return ExecType.nil;
                }
            }catch(NumberFormatException ex){
                switch(v){
                    case "C":
                        return ExecType.Expired;
                    case "F":
                        return ExecType.Trade;
                    case "H":
                        return ExecType.TradeCancel;
                    case "I":
                        return ExecType.OrderStatus;
                    default:
                        return ExecType.nil;
                }
            }
        }
    }

    public static enum TimeInForce {
        Day(0),
        GTC(1), //Good till cancelled
        IOC(3),//Immediate or Cancel (IOC) 
        FOK(4),// Fill or Kill (FoK) 
        GTD(6),// Good till date
        Session("S");
        int value=-1;
        String svalue;
        TimeInForce(String value) {
            this.svalue = value;
        }
        TimeInForce(int value) {
            this.value = value;
        }
        TimeInForce() {
            this.value = 0;
        }        
        @Override
        public String toString() {
            return "" + (this.value!=-1?this.value:this.svalue);
        }
        public int toInteger() {
            return (this.value!=-1?this.value:-1);
        }
        public static TimeInForce fromString(String v){
            try{
                int o = Integer.parseInt(v);
                switch(o){
                    case 0:
                        return TimeInForce.Day;
                    case 1:
                        return TimeInForce.GTC;
                    case 3:
                        return TimeInForce.IOC;
                    case 4:
                        return TimeInForce.FOK;
                    case 6:
                        return TimeInForce.GTD;
                    default:
                        return TimeInForce.Session;
                }
            }catch(Exception ex){
                return TimeInForce.Session;
            }
        }
        public static TimeInForce fromEtpTimeInForce(String v){
            switch(v){
                    case "19":
                        return TimeInForce.Day;
                    case "20":
                        return TimeInForce.GTC;
                    case "190":
                        return TimeInForce.IOC;
                    case "188":
                        return TimeInForce.FOK;
                    case "189":
                        return TimeInForce.GTD;
                    default:
                        return TimeInForce.Session;
            }
        }        
        public static String toEtpTimeInForce(TimeInForce v){
            switch(v){
                    case Day:
                        return "19";
                    case GTC:
                        return "20";
                    case IOC:
                        return "190";
                    case FOK:
                        return "188";
                    case GTD:
                        return "189";
                    default:
                        return "192";//Session
            }
        }        

    }
    public static enum OrderType {
        Unknown(0),
        LimitPrice(15),
        Market(16),
        StopStopLoss(17),
        StopLimit(18);
        int value;

        OrderType(int value) {
            this.value = value;
        }
        OrderType() {
            this.value = 0;
        }        
        @Override
        public String toString() {
            return "" + this.value;
        }

        public int toInteger() {
            return this.value;
        }
    }

    public static enum MassAction {
        Unknown(0),
        CancelStock(3),
        CancelAll(2);
        int value;

        MassAction(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + this.value;
        }

        public int toInteger() {
            return this.value;
        }
    }

    public static enum OperationType {
        Unknown(0),
        Buy(13),
        Sell(14),
        CancelBuy(176),
        CancelSell(177),
        ModifyBuy(174),
        ModifySell(175);

        int value;

        OperationType(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + this.value;
        }

        public int toInteger() {
            return this.value;
        }
    }

    public static enum OrderCategory {
        Unknown(0),
        Trigger(1),
        Order(2);

        int value;

        OrderCategory(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + this.value;
        }

        public int toInteger() {
            return this.value;
        }
    }

    public static enum OrderChannel {
        Unknown(0),
        Website(1),
        CallCenter(2),
        SMS(3),
        PDA(4),
        EBroker(5);
        int value;

        OrderChannel(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + this.value;
        }

        public int toInteger() {
            return this.value;
        }
    }

    public static enum OrderStatus {
        Unknown(0),
        Pending(97),
        Open(98),
        Rejected(99),
        Executed(100),
        Expired(101),
        Cancelled(102),
        PartialExecuted(178),
        PartialOpen(180);

        int value;

        OrderStatus(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + this.value;
        }

        public int toInteger() {
            return this.value;
        }
    }

    public static enum ExpirationType {
        Unknown(0),
        Day(19),
        GTC(20),
        Week(185),
        Month(186),
        OPG(187),
        FOK(188),
        GTD(189),
        FAK(21),
        GTT(191),
        SES(192),
        IOC(190);

        int value;

        ExpirationType(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "" + this.value;
        }

        public int toInteger() {
            return this.value;
        }
    }
    public static enum ExecInst{
        Nil(""),
        StayOnOffer("0"),//0 = Stay on offer side
        NotHeld("1"),//1 = Not held
        Work("2"),//2 = Work
        GoAlong("3"),//3 = Go along
        OverTheDay("4"),//4 = Over the day
        Held("5"),//5 = Held
        Participant("6"),//6 = Participant don't initiate
        StrictScale("7"),//7 = Strict scale
        TryToScale("8"),//8 = Try to scale
        StayOnBid("9"),//9 = Stay on bid side
        NoCross("A"),//A = No cross (cross is forbidden)
        Trailing("a"),//a = Trailing Stop Peg
        OKToCross("B"),//B = OK to cross
        StrictLimit("b"),//b = Strict Limit (No price improvement)
        IgnorePrice("c"),//c = Ignore Price Validity Checks
        CallFirst("C"),//C = Call first
        PegToLimit("d"),//d = Peg to Limit Price
        PercentOfVolume("D"),//D = Percent of volume (indicates that the sender does not want to be all of the volume on the floor vs. a specific percentage)
        DonotIncrease("E"),//E = Do not increase - DNI
        WorkToTarget("e"),//e = Work to Target Strategy
        DonotReduce("F"),//F = Do not reduce - DNR
        AllOrNone("G"),//G = All or none - AON
        ReinstateOnSystem("H"),//H = Reinstate on system failue (mutually exclusive with Q)
        InstitutionsOnly("I"),//I = Institutions only
        ReinstateOnTrading("J"),//J = Reinstate on Trading Halt (mutually exclusive with K)
        CancelOnTrading("K"),//K = Cancel on Trading Halt (mutually exclusive with J)
        LastPeg("L"),//L = Last peg (last sale)
        MidPricePeg("M"),//M = Mid-price peg (midprice of inside quote)
        NonNegotiable("N"),//N = Non-negotiable
        OpeningPeg("O"),//O = Opening peg
        MarketPeg("P"),//P = Market peg
        CancelOnSystem("Q"),//Q = Cancel on system failure (mutually exclusive with H)
        PrimaryPeg("R"),//R = Primary peg (primary market - buy at bid/sell at offer)
        Suspend("S"),//S = Suspend
        CustomerDisplayInstruction("U"),//U = Customer Display Instruction (Rule 11Ac1-1/4)
        Netting("V"),//V = Netting (for Forex)
        VWAP("W"),//W = Peg to VWAP
        TradeAlong("X"),//X = Trade Along
        TryToStop("Y"),//Y = Try To Stop
        CancelIfNotBest("Z"),//Z = Cancel if not best
        IntermarketSweep("f"),//f = Intermarket Sweep
        SingleExecution("j"),//j = Single execution requested for block trade
        ExternalRoutingAllowed("g"),//g = External Routing Allowed
        ExternalRoutingNotAllowed("h"),//h = External Routing Not Allowed
        Imbalance("i"),//i = Imbalance Only
        FixedPeg("T"),//T = Fixed Peg to Local best bid or offer at time of order
        BestExecution ("k");//k = Best Execution        
        String value;

        ExecInst(String value) {
            this.value = value;
        }
         public static ExecInst fromString(String v){
             switch(v){
                case "G":
                     return AllOrNone;
                default:
                    return Nil;
             }
         }
    }
}
