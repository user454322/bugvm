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
package com.bugvm.apple.addressbookui;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.addressbook.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 2.0 and later.
 * @deprecated Deprecated in iOS 9.0.
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("AddressBookUI") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABUnknownPersonViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ABUnknownPersonViewControllerPtr extends Ptr<ABUnknownPersonViewController, ABUnknownPersonViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ABUnknownPersonViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ABUnknownPersonViewController() {}
    protected ABUnknownPersonViewController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "unknownPersonViewDelegate")
    public native ABUnknownPersonViewControllerDelegate getUnknownPersonViewDelegate();
    @Property(selector = "setUnknownPersonViewDelegate:", strongRef = true)
    public native void setUnknownPersonViewDelegate(ABUnknownPersonViewControllerDelegate v);
    @Property(selector = "addressBook")
    public native ABAddressBook getAddressBook();
    @Property(selector = "setAddressBook:")
    public native void setAddressBook(ABAddressBook v);
    @Property(selector = "displayedPerson")
    public native ABPerson getDisplayedPerson();
    @Property(selector = "setDisplayedPerson:")
    public native void setDisplayedPerson(ABPerson v);
    @Property(selector = "alternateName")
    public native String getAlternateName();
    @Property(selector = "setAlternateName:")
    public native void setAlternateName(String v);
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "allowsActions")
    public native boolean allowsActions();
    @Property(selector = "setAllowsActions:")
    public native void setAllowsActions(boolean v);
    @Property(selector = "allowsAddingToAddressBook")
    public native boolean allowsAddingToAddressBook();
    @Property(selector = "setAllowsAddingToAddressBook:")
    public native void setAllowsAddingToAddressBook(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
