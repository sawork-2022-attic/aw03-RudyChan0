package com.example.webpos.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cart {

    private List<Item> items = new ArrayList<>();

    private double sum=0;

    public boolean addItem(Item item) {
        boolean res= items.add(item);
        countSum();
        return res;
    }

    public boolean deleteItem(int index){
        if(index+1>items.size())return false;
        items.remove(index);
        countSum();
        return true;
    }

    public boolean minus(int index){
        if(index+1>items.size())return false;
        if(items.get(index).getQuantity()==1)items.remove(index);
        else items.get(index).setQuantity(items.get(index).getQuantity()-1);
        countSum();
        return true;
    } 

    public boolean plus(int index){
        if(index+1>items.size())return false;
        items.get(index).setQuantity(items.get(index).getQuantity()+1);
        countSum();
        return true;
    } 

    public void countSum(){
        sum=0;
        for(Item item :items){
            sum+=item.getQuantity()*item.getProduct().getPrice();
        }
    }

    @Override
    public String toString() {
        if (items.size() ==0){
            return "Empty Cart";
        }
        double total = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cart -----------------\n"  );

        for (int i = 0; i < items.size(); i++) {
            stringBuilder.append(items.get(i).toString()).append("\n");
            total += items.get(i).getQuantity() * items.get(i).getProduct().getPrice();
        }
        stringBuilder.append("----------------------\n"  );

        stringBuilder.append("Total...\t\t\t" + total );

        return stringBuilder.toString();
    }
}
