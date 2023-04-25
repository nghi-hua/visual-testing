import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/team/800/project/4840/autonomous/user-journeys')

'step 1: Add visual checkpoint at Page_autonomous_user-journeys'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00008_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
