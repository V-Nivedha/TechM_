/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.myTraining.components.news;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class news__002e__html__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _dynamic_properties = bindings.get("properties");
_global_model = renderContext.call("use", com.myTraining.core.models.NewsModel.class.getName(), obj());
out.write("<div class=\"cmp-news\" data-cmp-is=\"news\">\r\n    <h2 class=\"cmp-news__title\">News Component</h2>\r\n\r\n    ");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div class=\"cmp-news__item\">\r\n        <p class=\"cmp-news__label\">Text:</p>\r\n        <pre class=\"cmp-news__output\">");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "text");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</pre>\r\n    </div>");
    }
}
out.write("\r\n\r\n    ");
{
    Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "newsDetail");
    if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
        out.write("<div class=\"cmp-news__item\">\r\n        <p class=\"cmp-news__label\">News Detail:</p>\r\n        <pre class=\"cmp-news__output\">");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "newsDetail"), "text");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</pre>\r\n    </div>");
    }
}
out.write("\r\n\r\n    ");
_global_model = renderContext.call("use", com.myTraining.core.models.NewsModel.class.getName(), obj());
out.write("<div class=\"cmp-news__item\">\r\n        <p class=\"cmp-news__label\">Published Date:</p>\r\n        <pre class=\"cmp-news__output\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "formattedPublishedDate"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</pre>\r\n    </div>\r\n    \r\n    \r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

