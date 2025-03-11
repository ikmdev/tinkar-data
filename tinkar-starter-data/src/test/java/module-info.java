open module tinkar.starter.data {	
	requires dev.ikm.tinkar.reasoner.service;
	requires dev.ikm.tinkar.provider.ephemeral;
	requires dev.ikm.tinkar.reasoner.elkowl;
	requires dev.ikm.tinkar.reasoner.elksnomed;
	requires dev.ikm.tinkar.reasoner.hybrid;
	requires org.junit.jupiter.api;
    requires dev.ikm.tinkar.common;
    requires dev.ikm.tinkar.composer;
    requires dev.ikm.tinkar.entity;
    requires dev.ikm.tinkar.provider.executor;
    requires dev.ikm.tinkar.provider.spinedarray;
    requires dev.ikm.tinkar.provider.entity;
    requires dev.ikm.jpms.eclipse.collections.api;
    requires org.slf4j;
	//requires maven.plugin.api; 
	//requires maven.plugin.annotations;
}