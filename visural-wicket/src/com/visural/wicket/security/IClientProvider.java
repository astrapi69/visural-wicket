/*
 *  Copyright 2010 Richard Nichols.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package com.visural.wicket.security;

/**
 * An object which provide the IClient for the current Context.
 *
 * Generally this would be implemented by an IoC glue class, or a thread local var
 * or session-store.
 *
 * @version $Id: IClientProvider.java 153 2010-04-09 07:13:53Z tibes80@gmail.com $
 * @author Richard Nichols
 */
public interface IClientProvider<T extends IClient> {

    T getCurrentClient();
}
