package com.bpm.fsr.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class VerifyProtocol implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("product")
	@org.kie.api.definition.type.Position(0)
	private java.lang.String product;
	@org.kie.api.definition.type.Label("isModemProtocolPresent")
	@org.kie.api.definition.type.Position(1)
	private java.lang.Boolean isModemProtocolPresent;
	@org.kie.api.definition.type.Label("modemProtocol")
	@org.kie.api.definition.type.Position(2)
	private java.lang.String modemProtocol;
	@org.kie.api.definition.type.Label("actualsSubscriberVPI")
	@org.kie.api.definition.type.Position(3)
	private java.lang.String actualsSubscriberVPI;
	@org.kie.api.definition.type.Label("actualsSubscriberVCI")
	@org.kie.api.definition.type.Position(4)
	private java.lang.String actualsSubscriberVCI;
	@org.kie.api.definition.type.Label("subscriberVPI")
	@org.kie.api.definition.type.Position(5)
	private java.lang.String subscriberVPI;
	@org.kie.api.definition.type.Label("subscriberVCI")
	@org.kie.api.definition.type.Position(6)
	private java.lang.String subscriberVCI;

	@org.kie.api.definition.type.Label("isPollDSLAMVpiVciPresent")
	@org.kie.api.definition.type.Position(7)
	private java.lang.Boolean isPollDSLAMVpiVciPresent;

	@org.kie.api.definition.type.Label("ICLVPIVCICompare")
	@org.kie.api.definition.type.Position(8)
	private java.lang.String iclVPIVCICompare;

	@org.kie.api.definition.type.Label("resultantPath")
	@org.kie.api.definition.type.Position(9)
	private java.lang.String resultantPath;

	@org.kie.api.definition.type.Label(value = "legacyMarket")
	@org.kie.api.definition.type.Position(value = 10)
	private java.lang.String legacyMarket;

	public java.lang.String getProduct() {
		return this.product;
	}

	public void setProduct(java.lang.String product) {
		this.product = product;
	}

	public java.lang.Boolean getIsModemProtocolPresent() {
		return this.isModemProtocolPresent;
	}

	public void setIsModemProtocolPresent(
			java.lang.Boolean isModemProtocolPresent) {
		this.isModemProtocolPresent = isModemProtocolPresent;
	}

	public java.lang.String getModemProtocol() {
		return this.modemProtocol;
	}

	public void setModemProtocol(java.lang.String modemProtocol) {
		this.modemProtocol = modemProtocol;
	}

	public java.lang.String getActualsSubscriberVPI() {
		return this.actualsSubscriberVPI;
	}

	public void setActualsSubscriberVPI(java.lang.String actualsSubscriberVPI) {
		this.actualsSubscriberVPI = actualsSubscriberVPI;
	}

	public java.lang.String getActualsSubscriberVCI() {
		return this.actualsSubscriberVCI;
	}

	public void setActualsSubscriberVCI(java.lang.String actualsSubscriberVCI) {
		this.actualsSubscriberVCI = actualsSubscriberVCI;
	}

	public java.lang.String getSubscriberVPI() {
		return this.subscriberVPI;
	}

	public void setSubscriberVPI(java.lang.String subscriberVPI) {
		this.subscriberVPI = subscriberVPI;
	}

	public java.lang.String getSubscriberVCI() {
		return this.subscriberVCI;
	}

	public void setSubscriberVCI(java.lang.String subscriberVCI) {
		this.subscriberVCI = subscriberVCI;
	}

	public java.lang.Boolean getIsPollDSLAMVpiVciPresent() {
		System.out.println("Inside getIsPollDSLAMVpiVciPresent actualsSubscriberVCI:"+actualsSubscriberVCI+" actualsSubscriberVPI:"+actualsSubscriberVPI);
		if(null != actualsSubscriberVCI && null != actualsSubscriberVPI){
			return true;
		}
		return false;
	}

	public void setIsPollDSLAMVpiVciPresent(
			java.lang.Boolean isPollDSLAMVpiVciPresent) {
		this.isPollDSLAMVpiVciPresent = isPollDSLAMVpiVciPresent;
	}

	public java.lang.String getIclVPIVCICompare() {
		System.out.println("Inside getICLVPIVCICompare actualsSubscriberVCI:"+actualsSubscriberVCI+" actualsSubscriberVPI:"+actualsSubscriberVPI+" subscriberVPI: "+subscriberVPI+" subscriberVCI: "+subscriberVCI);
		if( (null!=subscriberVPI && subscriberVPI.equalsIgnoreCase(actualsSubscriberVPI))
				&& (null != subscriberVCI && subscriberVCI.equalsIgnoreCase(actualsSubscriberVCI))){
			return "MATCH";
		}
		return "MISMATCH";
	}

	public void setIclVPIVCICompare(java.lang.String iclVPIVCICompare) {
		this.iclVPIVCICompare = iclVPIVCICompare;
	}

	public java.lang.String getResultantPath() {
		return this.resultantPath;
	}

	public void setResultantPath(java.lang.String resultantPath) {
		this.resultantPath = resultantPath;
	}

	public java.lang.String getLegacyMarket() {
		return this.legacyMarket;
	}

	public void setLegacyMarket(java.lang.String legacyMarket) {
		this.legacyMarket = legacyMarket;
	}

	public VerifyProtocol() {
	}

	public VerifyProtocol(java.lang.String product,
			java.lang.Boolean isModemProtocolPresent,
			java.lang.String modemProtocol,
			java.lang.String actualsSubscriberVPI,
			java.lang.String actualsSubscriberVCI,
			java.lang.String subscriberVPI, java.lang.String subscriberVCI,
			java.lang.Boolean isPollDSLAMVpiVciPresent,
			java.lang.String iclVPIVCICompare, java.lang.String resultantPath,
			java.lang.String legacyMarket) {
		this.product = product;
		this.isModemProtocolPresent = isModemProtocolPresent;
		this.modemProtocol = modemProtocol;
		this.actualsSubscriberVPI = actualsSubscriberVPI;
		this.actualsSubscriberVCI = actualsSubscriberVCI;
		this.subscriberVPI = subscriberVPI;
		this.subscriberVCI = subscriberVCI;
		this.isPollDSLAMVpiVciPresent = isPollDSLAMVpiVciPresent;
		this.iclVPIVCICompare = iclVPIVCICompare;
		this.resultantPath = resultantPath;
		this.legacyMarket = legacyMarket;
	}

	@Override
	public String toString() {
		return "VerifyProtocol [product=" + product
				+ ", isModemProtocolPresent=" + isModemProtocolPresent
				+ ", modemProtocol=" + modemProtocol
				+ ", actualsSubscriberVPI=" + actualsSubscriberVPI
				+ ", actualsSubscriberVCI=" + actualsSubscriberVCI
				+ ", subscriberVPI=" + subscriberVPI + ", subscriberVCI="
				+ subscriberVCI + ", isPollDSLAMVpiVciPresent="
				+ isPollDSLAMVpiVciPresent + ", iclVPIVCICompare="
				+ iclVPIVCICompare + ", resultantPath=" + resultantPath
				+ ", legacyMarket=" + legacyMarket + "]";
	}
	
	

}