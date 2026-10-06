<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_if (window.top  window.self)</name>
   <tag></tag>
   <elementGuidId>bbdf2644-20b8-495d-8b75-5d2aad97b06b</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*[@lang = 'en']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>[lang=&quot;en&quot;]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
      <webElementGuid>ccde6603-0af4-4f09-9bc5-bb3f740415ac</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
      <webElementGuid>2628133d-c0b7-4866-b1a1-aac102ade27e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
    
    
    
      if (window.top !== window.self) {
        window.top.location = window.self.location;
      }
      // On the public, non-Aramex test domain, suppress Aramex branding so the
      // page is not mistaken for a phishing clone of pickup.aramex.com.
      // Production (pickup.aramex.com) keeps its normal branding.
      (function () {
        var host = window.location.hostname.toLowerCase();
        var isTestHost =
          host === &quot;pickup-tool.com&quot; || host.endsWith(&quot;.pickup-tool.com&quot;);
        if (isTestHost) {
          document.title = &quot;Pickup Tool — Test Environment&quot;;
          var favicon = document.getElementById(&quot;app-favicon&quot;);
          if (favicon) {
            favicon.type = &quot;image/svg+xml&quot;;
            favicon.href = &quot;/icons/box-outline.svg&quot;;
          }
        }
      })();
    Pickup Tool — Test Environment
    Pickup Tool
    
    
  
  
    

  

</value>
      <webElementGuid>5ab5094f-881b-4da0-8e25-d7797f6b3b4a</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>parent</name>
      <type>Main</type>
      <value>md5.v1-cbb33e1b714e298e30398b7f6cbbad65</value>
      <webElementGuid>22439a4f-295f-4989-9c7a-f5ccb521d562</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>//*[@lang = 'en']</value>
      <webElementGuid>76989357-7ddb-4417-bdbb-f04517485c8e</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//*[@lang = 'en']</value>
      <webElementGuid>b0d786cf-52aa-42f9-81d5-fc9cdee84e50</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//html[(text() = '
    
    
    
    
    
      if (window.top !== window.self) {
        window.top.location = window.self.location;
      }
      // On the public, non-Aramex test domain, suppress Aramex branding so the
      // page is not mistaken for a phishing clone of pickup.aramex.com.
      // Production (pickup.aramex.com) keeps its normal branding.
      (function () {
        var host = window.location.hostname.toLowerCase();
        var isTestHost =
          host === &quot;pickup-tool.com&quot; || host.endsWith(&quot;.pickup-tool.com&quot;);
        if (isTestHost) {
          document.title = &quot;Pickup Tool — Test Environment&quot;;
          var favicon = document.getElementById(&quot;app-favicon&quot;);
          if (favicon) {
            favicon.type = &quot;image/svg+xml&quot;;
            favicon.href = &quot;/icons/box-outline.svg&quot;;
          }
        }
      })();
    Pickup Tool — Test Environment
    Pickup Tool
    
    
  
  
    

  

' or . = '
    
    
    
    
    
      if (window.top !== window.self) {
        window.top.location = window.self.location;
      }
      // On the public, non-Aramex test domain, suppress Aramex branding so the
      // page is not mistaken for a phishing clone of pickup.aramex.com.
      // Production (pickup.aramex.com) keeps its normal branding.
      (function () {
        var host = window.location.hostname.toLowerCase();
        var isTestHost =
          host === &quot;pickup-tool.com&quot; || host.endsWith(&quot;.pickup-tool.com&quot;);
        if (isTestHost) {
          document.title = &quot;Pickup Tool — Test Environment&quot;;
          var favicon = document.getElementById(&quot;app-favicon&quot;);
          if (favicon) {
            favicon.type = &quot;image/svg+xml&quot;;
            favicon.href = &quot;/icons/box-outline.svg&quot;;
          }
        }
      })();
    Pickup Tool — Test Environment
    Pickup Tool
    
    
  
  
    

  

')]</value>
      <webElementGuid>603ec720-e24e-4254-91ac-12857ccd9082</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
