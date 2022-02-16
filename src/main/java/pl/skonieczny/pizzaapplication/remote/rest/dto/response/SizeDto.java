package pl.skonieczny.pizzaapplication.remote.rest.dto.response;

import java.math.BigDecimal;

public class SizeDto {
    private Integer id;
    private BigDecimal price;
    private SizeType size;
    public SizeDto(){

    }
    public SizeDto(Integer idd, BigDecimal price, SizeType size){
    this.id=id;
    this.price=price;
    this.size=size;
    }
    public Integer getId(){
    return this.id;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
    public SizeType getSize(){
        return this.size;
    }
    public void setId(Integer x){
        this.id=x;
    }
    public void setPrice(BigDecimal x){
        this.price=x;
    }
    public void setSize(SizeType x){
        this.size=x;
    }
}
