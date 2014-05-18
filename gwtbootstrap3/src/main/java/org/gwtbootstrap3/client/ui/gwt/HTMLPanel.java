package org.gwtbootstrap3.client.ui.gwt;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
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
 * #L%
 */

import com.google.gwt.dom.client.Style;
import com.google.gwt.safehtml.shared.SafeHtml;
import org.gwtbootstrap3.client.ui.base.*;
import org.gwtbootstrap3.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap3.client.ui.base.mixin.DataSpyMixin;
import org.gwtbootstrap3.client.ui.base.mixin.DataTargetMixin;
import org.gwtbootstrap3.client.ui.base.mixin.IdMixin;
import org.gwtbootstrap3.client.ui.constants.DeviceSize;
import org.gwtbootstrap3.client.ui.constants.Spy;

/**
 * @author Sven Jacobs
 * @author Grant Slender
 */
public class HTMLPanel extends com.google.gwt.user.client.ui.HTMLPanel implements HasId, HasDataSpy, HasDataTarget, HasResponsiveness, HasInlineStyle {

    private final DataSpyMixin<HTMLPanel> spyMixin = new DataSpyMixin<HTMLPanel>(this);
    private final DataTargetMixin<HTMLPanel> targetMixin = new DataTargetMixin<HTMLPanel>(this);
    private final IdMixin<HTMLPanel> idMixin = new IdMixin<HTMLPanel>(this);

    public HTMLPanel(final String html) {
        super(html);
    }

    public HTMLPanel(final SafeHtml safeHtml) {
        super(safeHtml);
    }

    public HTMLPanel(final String tag, final String html) {
        super(tag, html);
    }

    @Override
    public void setId(final String id) {
        idMixin.setId(id);
    }

    @Override
    public String getId() {
        return idMixin.getId();
    }

    @Override
    public void setDataSpy(final Spy spy) {
        spyMixin.setDataSpy(spy);
    }

    @Override
    public Spy getDataSpy() {
        return spyMixin.getDataSpy();
    }

    @Override
    public void setDataTarget(final String dataTarget) {
        targetMixin.setDataTarget(dataTarget);
    }

    @Override
    public String getDataTarget() {
        return targetMixin.getDataTarget();
    }

    @Override
    public void setVisibleOn(DeviceSize deviceSize) {
        StyleHelper.setVisibleOn(this, deviceSize);
    }

    @Override
    public void setHiddenOn(DeviceSize deviceSize) {
        StyleHelper.setHiddenOn(this, deviceSize);
    }

    @Override
    public void setMarginTop(final double margin) {
        getElement().getStyle().setMarginTop(margin, Style.Unit.PX);
    }

    @Override
    public void setMarginLeft(final double margin) {
        getElement().getStyle().setMarginLeft(margin, Style.Unit.PX);
    }

    @Override
    public void setMarginRight(final double margin) {
        getElement().getStyle().setMarginRight(margin, Style.Unit.PX);
    }

    @Override
    public void setMarginBottom(final double margin) {
        getElement().getStyle().setMarginBottom(margin, Style.Unit.PX);
    }

    @Override
    public void setPaddingTop(final double padding) {
        getElement().getStyle().setPaddingTop(padding, Style.Unit.PX);
    }

    @Override
    public void setPaddingLeft(final double padding) {
        getElement().getStyle().setPaddingLeft(padding, Style.Unit.PX);
    }

    @Override
    public void setPaddingRight(final double padding) {
        getElement().getStyle().setPaddingRight(padding, Style.Unit.PX);
    }

    @Override
    public void setPaddingBottom(final double padding) {
        getElement().getStyle().setPaddingBottom(padding, Style.Unit.PX);
    }
}
