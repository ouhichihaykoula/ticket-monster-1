package org.jboss.seam.example.ticketmonster.action;

import javax.enterprise.inject.Produces;

import org.infinispan.config.Configuration;
import org.jboss.seam.example.ticketmonster.qualifier.RowCache;
import org.jboss.seam.example.ticketmonster.qualifier.SectionCache;
import org.jboss.seam.example.ticketmonster.qualifier.SectionRowCache;
import org.jboss.seam.infinispan.Infinispan;

/**
 * Configures various caches used throughout the app.
 * 
 * @author Shane Bryzak
 * 
 */
public class CacheConfig
{
   @Produces
   @Infinispan("rowCache")
   @RowCache
   public Configuration getRowCacheConfiguration()
   {
      Configuration configuration = new Configuration();
      return configuration;
   }
   
   @Produces
   @Infinispan("sectionCache")
   @SectionCache
   public Configuration getSectionCacheConfiguration()
   {
      Configuration configuration = new Configuration();
      return configuration;
   }   
   
   /*@Produces
   @Infinispan("sectionRowCache")
   @SectionRowCache
   public Configuration getSectionRowCacheConfiguration()
   {
      Configuration configuration = new Configuration();
      return configuration;
   }*/
}
