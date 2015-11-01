/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.coreservices;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.corefoundation.CFArray;
import com.bugvm.apple.corefoundation.CFMutableArray;
import com.bugvm.apple.corefoundation.CFString;
import com.bugvm.apple.corefoundation.CFType;
import com.bugvm.apple.foundation.GlobalValueEnumeration;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CFProxyType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFProxyType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFProxyType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFProxyType toObject(Class<CFProxyType> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFProxyType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFProxyType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFProxyType> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFProxyType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFProxyType.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFProxyType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFProxyType o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static final CFProxyType None = new CFProxyType("None");
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static final CFProxyType HTTP = new CFProxyType("HTTP");
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static final CFProxyType HTTPS = new CFProxyType("HTTPS");
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static final CFProxyType SOCKS = new CFProxyType("SOCKS");
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static final CFProxyType FTP = new CFProxyType("FTP");
    /**
     * @since Available in iOS 2.0 and later.
     */
    public static final CFProxyType AutoConfigurationURL = new CFProxyType("AutoConfigurationURL");
    /**
     * @since Available in iOS 3.0 and later.
     */
    public static final CFProxyType AutoConfigurationJavaScript = new CFProxyType("AutoConfigurationJavaScript");
    /*</constants>*/
    
    private static /*<name>*/CFProxyType/*</name>*/[] values = new /*<name>*/CFProxyType/*</name>*/[] {/*<value_list>*/None, HTTP, HTTPS, SOCKS, FTP, AutoConfigurationURL, AutoConfigurationJavaScript/*</value_list>*/};
    
    /*<name>*/CFProxyType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFProxyType/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFProxyType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFProxyType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 2.0 and later.
         */
        @GlobalValue(symbol="kCFProxyTypeNone", optional=true)
        public static native CFString None();
        /**
         * @since Available in iOS 2.0 and later.
         */
        @GlobalValue(symbol="kCFProxyTypeHTTP", optional=true)
        public static native CFString HTTP();
        /**
         * @since Available in iOS 2.0 and later.
         */
        @GlobalValue(symbol="kCFProxyTypeHTTPS", optional=true)
        public static native CFString HTTPS();
        /**
         * @since Available in iOS 2.0 and later.
         */
        @GlobalValue(symbol="kCFProxyTypeSOCKS", optional=true)
        public static native CFString SOCKS();
        /**
         * @since Available in iOS 2.0 and later.
         */
        @GlobalValue(symbol="kCFProxyTypeFTP", optional=true)
        public static native CFString FTP();
        /**
         * @since Available in iOS 2.0 and later.
         */
        @GlobalValue(symbol="kCFProxyTypeAutoConfigurationURL", optional=true)
        public static native CFString AutoConfigurationURL();
        /**
         * @since Available in iOS 3.0 and later.
         */
        @GlobalValue(symbol="kCFProxyTypeAutoConfigurationJavaScript", optional=true)
        public static native CFString AutoConfigurationJavaScript();
        /*</values>*/
    }
}