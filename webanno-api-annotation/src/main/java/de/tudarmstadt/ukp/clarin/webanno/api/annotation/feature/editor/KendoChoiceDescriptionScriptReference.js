/*
 * Copyright 2018
 * Ubiquitous Knowledge Processing (UKP) Lab and FG Language Technology
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
function applyTooltip(aElement) {
  if (!$(aElement).data('ui-tooltip')) {
    $(aElement).tooltip({
      position: { my: 'center bottom', at: 'center top', of: '.page-footer' },
      show: false,
      hide: false,
      content: function() { 
        var html =  
          '<div class="tooltip-title">' + ($(this).text() ? $(this).text() : 'no title') +
          '</div> <div class="tooltip-content tooltip-pre">' + ($(this).attr('title') ? $(this).attr('title') : 'no description' )+'</div>';
        return html;
      }
    });
    setTimeout(function() { $(aElement).tooltip().mouseover();; }, 0);
  }
}
