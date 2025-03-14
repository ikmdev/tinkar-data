open module dev.ikm.tinkar {	
	requires dev.ikm.tinkar.provider.ephemeral;
	requires dev.ikm.tinkar.reasoner.elkowl;
	requires org.junit.jupiter.api;
    requires dev.ikm.tinkar.common;
    requires dev.ikm.tinkar.composer;
    requires dev.ikm.tinkar.entity;
    requires dev.ikm.tinkar.provider.executor;
    requires dev.ikm.tinkar.provider.spinedarray;
    requires dev.ikm.tinkar.provider.entity;
    requires dev.ikm.jpms.eclipse.collections.api;
    requires org.slf4j;
	requires dev.ikm.tinkar.reasoner.service;
	
	// requires maven.plugin.api; 
	// requires maven.plugin.annotations;
}
