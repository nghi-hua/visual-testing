import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/user/settings')

'step 1: Add visual checkpoint at Page_user_settings'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00003_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
