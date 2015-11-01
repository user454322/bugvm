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
package com.bugvm.apple.glkit;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GLKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GLKReflectionMapEffect/*</name>*/ 
    extends /*<extends>*/GLKBaseEffect/*</extends>*/ 
    /*<implements>*/implements GLKNamedEffect/*</implements>*/ {

    /*<ptr>*/public static class GLKReflectionMapEffectPtr extends Ptr<GLKReflectionMapEffect, GLKReflectionMapEffectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GLKReflectionMapEffect.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GLKReflectionMapEffect() {}
    protected GLKReflectionMapEffect(NSObject.SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "textureCubeMap")
    public native GLKEffectPropertyTexture getTextureCubeMap();
    @Property(selector = "matrix")
    public native @ByVal GLKMatrix3 getMatrix();
    @Property(selector = "setMatrix:")
    public native void setMatrix(@ByVal GLKMatrix3 v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "prepareToDraw")
    public native void prepareToDraw();
    /*</methods>*/
}