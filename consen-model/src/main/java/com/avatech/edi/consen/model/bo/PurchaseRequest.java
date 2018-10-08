package com.avatech.edi.consen.model.bo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "AVA_MM_VIEW_OPRQ")
public class PurchaseRequest {

    @Id
    @Column(name = "Uniquekey")
    private String uniqueKey;

    @Column(name = "Companycode")
    private String corpcode;

    @Column(name = "Docentry")
    private String requestno;

    @Column(name = "Linenum")
    private String itemno;

    @Column(name = "Prjcode")
    private String projectno;

    @Column(name = "Prjname")
    private String projectnm;

    @Column(name = "Requestdate")
    private Date needdate;

    @Column(name = "Proname")
    private String prodname;

    @Column(name = "Itemcode")
    private String apimaterNo;

    @Column(name = "Spec")
    private String speco;

    @Column(name = "Quantity")
    private Double intqty;

    @Column(name = "Unit")
    private String unit;

    @Column(name = "PurchaseType")
    private String purchaseRequestType;

    @Column(name = "Factoryname")
    private String resourcefrom;

    @Column(name = "Factoryaddr")
    private String conaddr;


    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public String getCorpcode() {
        return corpcode;
    }

    public void setCorpcode(String corpcode) {
        this.corpcode = corpcode;
    }

    public String getRequestno() {
        return requestno;
    }

    public void setRequestno(String requestno) {
        this.requestno = requestno;
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno;
    }

    public String getProjectno() {
        return projectno;
    }

    public void setProjectno(String projectno) {
        this.projectno = projectno;
    }

    public String getProjectnm() {
        return projectnm;
    }

    public void setProjectnm(String projectnm) {
        this.projectnm = projectnm;
    }

    public Date getNeeddate() {
        return needdate;
    }

    public void setNeeddate(Date needdate) {
        this.needdate = needdate;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getApimaterNo() {
        return apimaterNo;
    }

    public void setApimaterNo(String apimaterNo) {
        this.apimaterNo = apimaterNo;
    }

    public String getSpeco() {
        return speco;
    }

    public void setSpeco(String speco) {
        this.speco = speco;
    }

    public Double getIntqty() {
        return intqty;
    }

    public void setIntqty(Double intqty) {
        this.intqty = intqty;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPurchaseRequestType() {
        return purchaseRequestType;
    }

    public void setPurchaseRequestType(String purchaseRequestType) {
        this.purchaseRequestType = purchaseRequestType;
    }

    public String getResourcefrom() {
        return resourcefrom;
    }

    public void setResourcefrom(String resourcefrom) {
        this.resourcefrom = resourcefrom;
    }

    public String getConaddr() {
        return conaddr;
    }

    public void setConaddr(String conaddr) {
        this.conaddr = conaddr;
    }
}
